### Hexlet tests and linter status:
[![Actions Status](https://github.com/Zyabridos/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/Zyabridos/java-project-61/actions)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Zyabridos_brain_games_java&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Zyabridos_brain_games_java)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Zyabridos_brain_games_java&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Zyabridos_brain_games_java)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Zyabridos_brain_games_java&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=Zyabridos_brain_games_java)


## Project Description
This project was created to play a collection of simple mathematical games in the console.
It includes five games, each consisting of three rounds.

## Setup
In order to setup the game, a player should run following commands in the command line:
```bash
$ git clone https://github.com/Zyabridos/brain_games_java
$ make run-dist
```

The main rule is the same for all games:
To win, the player must give three correct answers in a row.
Any wrong answer ends the game immediately.

Each game displays its specific rules after greeting the player.
## Prerequisites
- Java (JDK 17 or later recommended)
- Make (for using Makefile to build and run the project)

## 🎮 How to Play
To play a game, simply type the name of the game you want to play in the console.
Do not use quotation marks.
The list of available games is shown below:

### 🧠 brain-even
A game where the player must determine if a given number is even or not.

### ➕ brain-calc
A game where the player is shown a mathematical expression and must calculate the result.

### 🔢 brain-gcd
A game where the player must find the greatest common divisor (GCD) of two given numbers.

### 🔁 brain-progression
A game where the player sees an arithmetic progression with one number missing and must find the missing number.

### 🔍 brain-prime
A game where the player must determine whether a given number is a prime number.