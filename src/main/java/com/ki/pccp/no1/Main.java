package com.ki.pccp.no1;

public class Main {
    public static void main(String[] args) {

    }

}
class Solution {
    public String solution(String video_len, String pos, String op_start, String op_end, String[] commands) {
        // 문자열 시간을 분으로 변환
        int[] videoTime = parseTime(video_len);
        int[] currentPosition = parseTime(pos);
        int[] openingStart = parseTime(op_start);
        int[] openingEnd = parseTime(op_end);

        for (String command : commands) {
            if (command.equals("prev")) {
                movePrev(currentPosition, openingStart, openingEnd);
            } else if (command.equals("next")) {
                moveNext(currentPosition, videoTime, openingStart, openingEnd);
            }
        }

        return formatTime(currentPosition);
    }

    private int[] parseTime(String time) {
        String[] parts = time.split(":");
        return new int[]{Integer.parseInt(parts[0]), Integer.parseInt(parts[1])};
    }

    private void movePrev(int[] position, int[] opStart, int[] opEnd) {
        position[1] -= 10;
        if (position[1] < 0) {
            position[0] -= 1;
            position[1] += 60;
        }
        if (position[0] < 0) {
            position[0] = 0;
            position[1] = 0;
        }
        if (isInOpening(position, opStart, opEnd)) {
            position[0] = opEnd[0];
            position[1] = opEnd[1];
        }
    }

    private void moveNext(int[] position, int[] videoTime, int[] opStart, int[] opEnd) {
        // 먼저 현재 위치가 오프닝 구간에 포함되면 오프닝 종료로 이동
        if (isInOpening(position, opStart, opEnd)) {
            position[0] = opEnd[0];
            position[1] = opEnd[1];
        }

        // 10초를 더한다
        position[1] += 10;
        if (position[1] >= 60) {
            position[0] += 1;
            position[1] -= 60;
        }

        // 영상 끝을 넘지 않도록 처리
        if (position[0] > videoTime[0] || (position[0] == videoTime[0] && position[1] > videoTime[1])) {
            position[0] = videoTime[0];
            position[1] = videoTime[1];
        }

        // 10초 뒤로 이동 후에 오프닝 구간에 포함되면 다시 오프닝 끝으로 이동
        if (isInOpening(position, opStart, opEnd)) {
            position[0] = opEnd[0];
            position[1] = opEnd[1];
        }
    }

    private boolean isInOpening(int[] position, int[] opStart, int[] opEnd) {
        return (position[0] > opStart[0] || (position[0] == opStart[0] && position[1] >= opStart[1])) &&
                (position[0] < opEnd[0] || (position[0] == opEnd[0] && position[1] <= opEnd[1]));
    }

    private String formatTime(int[] time) {
        return String.format("%02d:%02d", time[0], time[1]);
    }
}
