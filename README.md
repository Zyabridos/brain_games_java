### Hexlet tests and linter status:
[![Actions Status](https://github.com/Zyabridos/java-project-61/actions/workflows/hexlet-check.yml/badge.svg)](https://github.com/Zyabridos/java-project-61/actions)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Zyabridos_brain_games_java&metric=bugs)](https://sonarcloud.io/summary/new_code?id=Zyabridos_brain_games_java)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Zyabridos_brain_games_java&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=Zyabridos_brain_games_java)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Zyabridos_brain_games_java&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=Zyabridos_brain_games_java)


## Project Description
A CLI-based collection of five simple math games, created to practice Java fundamentals and logic.

Each game consists of three rounds, and the goal is to answer three questions correctly in a row.
One mistake ends the game immediately.

Game-specific rules are shown **after you enter the game number**.


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
After starting the app, you will see a menu:

```mathematica
Please enter the game number and press Enter.
1 - Greet
2 - Even
3 - Calc
4 - GCD
5 - Progression
6 - Prime
0 - Exit
Enter a number to start a game.
```
## 🕹️ Available Games
```bash
2 - Even – brain-even
```
Determine whether the given number is even.
Answer "yes" if the number is even, otherwise answer "no".

```bash
3 - Calc – brain-calc
```
Calculate the result of a random arithmetic expression.
Operators: +, -, *.

```bash
4 - GCD – brain-gcd
```
Find the greatest common divisor of two given numbers.

```bash
5 - Progression – brain-progression
```
Find the missing number in an arithmetic progression.

```bash
6 - Prime – brain-prime
```
Decide whether the given number is prime.
Answer "yes" if it’s prime, otherwise "no".

```bash
1 - Greet
```
Just shows a greeting with your name (no game).

```bash
Exit
```
Choose 0 at any time to quit the application.

