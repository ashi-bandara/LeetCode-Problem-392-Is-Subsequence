
# LeetCode Challenge D40


## Overview

Welcome to my LeetCode solution repository! This project addresses the coding challenge presented by [392. Is Subsequence](https://leetcode.com/problems/is-subsequence/). Below, you'll find details about the problem, my approach to solving it, and the implemented solution.

## Problem Statement

Given two strings  `s`  and  `t`, return  `true` _if_ `s` _is a  **subsequence**  of_ `t`_, or_ `false` _otherwise_.

A  **subsequence**  of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e.,  `"ace"`  is a subsequence of  `"abcde"`  while  `"aec"`  is not).

**Example**
> **Input:** s = "abc", t = "ahbgdc"
> 
>**Output:** true

**Language Used**
> Java

**Difficulty**
> Easy

## Solution Overview
While finding if one string is a substring of another is straightforward, the key point in this algorithm is ensuring that the characters of the substring (`s`) appear in the order of the original string (`t`). 

The approach involves using two pointers (`i` and `j`) to iterate through the characters of both strings. The loop continues until either all characters in `s` have been processed or all characters in `t` have been processed. Inside the loop, the algorithm compares characters from `s` with characters from `t`, incrementing the pointer `i` only when there is a match. The pointer `j` is always incremented, ensuring progression through the characters of `t`. The crucial aspect is the condition `i == sArray.length` outside the loop, checking if all characters from `s` have been found in the correct order in `t`. This ensures that `s` is a subsequence of `t` in terms of the order of characters. The algorithm emphasizes the requirement for characters to appear in the same order, distinguishing it from a simple substring check where order might not matter.

