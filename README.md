# 💎 Java — Small Practice Programs

[![Run Program](https://github.com/shahidahmed0/java/actions/workflows/run.yml/badge.svg)](https://github.com/shahidahmed0/java/actions/workflows/run.yml)
![Language-Java](https://img.shields.io/badge/Language-Java-red)


> A collection of small, focused Java console programs for learning and quick demos.  
> Clean, runnable examples ideal for beginners and interview practice.

---

## 📋 Table of Contents
- [About](#about)  
- [Programs](#programs)  
- [Quick Start (Local)](#quick-start-local)  
- [Run in GitHub Actions (CI)](#run-in-github-actions-ci)  
- [Run in Codespaces / Online IDEs](#run-in-codespaces--online-ides)  
- [Project Structure & Conventions](#project-structure--conventions)  
- [How to add a demo GIF / screenshot](#how-to-add-a-demo-gif--screenshot)  
- [Contributing](#contributing)  
- [Troubleshooting](#troubleshooting)  
- [License & Contact](#license--contact)

---

## 🧾 About
This repo contains beginner-friendly Java console apps such as a calculator, simple banking simulator, dice examples, and login/password demos. Each file is self-contained so you can compile and run it directly from the terminal or via CI.

---

## 📂 Programs
| File | Purpose | Example output |
|------|---------|----------------|
| `age1.java` | Age input & response example | `Enter age: 18` → `You are an adult.` |
| `calculator1.java` | Calculator (`+ - * / ^`) | `5 10 +` → `Result: 15` |
| `login.java` | Password creation & login simulator | `Create password...` → `Login successful` |
| `diceface.java` | Prints dice face for a single roll | `Dice rolled: 4` |
| `inf_dice.java` | Rolls dice repeatedly in a loop | `Roll 1: 2, Roll 2: 5, ...` |
| `bank.java` | Deposit/withdraw simple banking demo | `Deposit 500 -> Balance: 500` |

> ✅ Each program is kept intentionally small so you can study one concept at a time.

---

## 🚀 Quick Start (Local)
Open a terminal in the folder containing the `.java` file.

**Compile a single file**
```bash
javac calculator1.java
