package ex03.test;

/**
 *  5, 8, 2, 4, 3(n)
 * 회전수 : n-1
 * 1회전 비교 횟수 : n-1
 * 2회전 비교 횟수 : n-2
 * 3회전 비교 횟수 : n-3
 * 4회전 비교 횟수 : n-4
 *
 * 1. 1회전(4바퀴)
 * 5, 8, 2, 4, 3
 * (1) 5, 8 비교 (변화없음)
 * (2) 8, 2 비교 (5, 2, 8, 4, 3)
 * (3) 8, 4 비교 (5, 2, 4, 8, 3)
 * (4) 8, 3 비교 (5, 2, 4, 3, 8)
 *
 * 3, 4, 8, 2, 5
 * (1) (3,4,8,2,5)
 * (2) (3,4,8,2,5)
 * (3) (3,4,2,8,5)
 * (4) (3,4,2,5,8)
 *
 * 1. 2회전(3바퀴)
 *
 * 5, 2, 4, 3, 8
 *
 * (1) 5, 2 비교 (2,5,4,3,8)
 *
 * (2) 5, 4 비교 (2,4,5,3,8)
 *
 * (3) 5, 3 비교 (2,4,3,5,8)
 *
 * 1. 3회전
 *
 * 2, 4, 3, 5, 8
 *
 * (1) 2, 4 비교 (2,4,3,5,8)
 *
 * (2) 4, 3 비교 (2,3,4,5,8)
 *
 * 1. 4회전
 *
 * 2, 3, 4, 5, 8
 *
 * (1) 2, 3비교 (2, 3, 4, 5, 8)
 */
public class BubbleSort {
}
