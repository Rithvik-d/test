package com.company;
import java.util.Scanner;
public class Source {
    public static void main(String[] args) {
        int[] arr = {7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 10, 12, 13, 15};
        int[] descArr = {15, 13, 12, 10, 9, 7, 4, 2, 1};

        int number = 7;
        int index = getIndexFromAscendingBinarySearch(arr, number);
        int c = getFirstIndexBinarySearchAscending(arr, number);
        int b = getIndexFromDescendingBinarySearch(descArr, number);
        System.out.println(index == -1 ? ("The number " + number + " is not present in the array.") :
                ("Got the number " + number + " at index position " + index));
        System.out.println(b == -1 ? ("The number for FromDescendingBinarySearch " + number + " is not present in the array.") :
                ("Got the number for FromDescendingBinarySearch " + number + " at index position " + b));
        System.out.println(c == -1 ? ("The number for FirstIndexBinarySearchAscending " + number + " is not present in the array.") :
                ("Got the number for FirstIndexBinarySearchAscending " + number + " at index position " + c));
    }

    public static int getIndexFromAscendingBinarySearch(int[] arr, int number) {
        int index = -1;

        int l = 0, r = arr.length - 1, mid;
        while (l <= r) {
            System.out.println("l = " + l + ", r = " + r);
            mid = (l + r) / 2;

            if (arr[mid] > number) {
                r = mid - 1;
            } else if (arr[mid] < number) {
                l = mid + 1;
            } else {
                index = mid;
                break;
            }
        }

        return index;
    }

    public static int getIndexFromDescendingBinarySearch(int[] arr, int number) {
        int index = -1;

        int l = 0, r = arr.length - 1, mid;
        while (l <= r) {
            System.out.println("dl = " + l + ", dr = " + r);
            mid = (l + r) / 2;

            if (arr[mid] < number) {
                r = mid - 1;
            } else if (arr[mid] > number) {
                l = mid + 1;
            } else {
                if (arr[mid] == number) {
                    for (int i = l; i <= r; i++) {
                        if (arr[i] == arr[mid]) {
                            index = i;
                            break;
                        }
                    }
                }

                break;
            }
        }

        return index;
    }


    public static int getFirstIndexBinarySearchAscending(int[] arr, int number) {
        // If the number is repeated in the array, return the left most index,
        // i.e. for the array
        // {7, 7, 7, 7, 7, 7, 8, 8, 8, 9, 10, 12, 13, 15} -> return 0
        int index = -1;
        int l = 0, r = arr.length - 1, mid;
        while (l <= r) {
            System.out.println("l = " + l + ", r = " + r);
            mid = (l + r) / 2;

            if (arr[mid] > number) {
                r = mid - 1;
            } else if (arr[mid] < number) {
                l = mid + 1;
            } else {
                if (arr[mid] == number) {
                    for (int i = l; i <= r; i++) {
                        if (arr[i] == arr[mid]) {
                            index = i;
                            break;
                        }
                    }
                }

                break;
            }
        }

        return index;


    }
}