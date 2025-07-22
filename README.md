# 🎯 Wordle-Game
![Java](https://img.shields.io/badge/Java-8%2B-blue?logo=java)

A Java-based adaptation of the popular **Wordle** word-guessing game.  
Guess the daily 5-letter word within 6 attempts and get instant feedback on your accuracy.

---

## 🕹 Gameplay

- A secret 5-letter word is chosen.
- Player has **6 attempts** to guess the word.
- After each guess:
  - **Green**: Correct letter in correct position.
  - **Yellow**: Correct letter in wrong position.
  - **Gray**: Letter not in the word.  
- Follows traditional Wordle rules with daily solutions :contentReference[oaicite:1]{index=1}.

---

## 💡 Features

- Console-based Java implementation — no GUI needed.
- Word list loaded from a text file.
- User-friendly input and result display.
- Replayable with fresh words.
- Easily extended to support custom word lists.

---

## 🛠 Tech Stack

- **Java** (JDK 8+)
- Standard I/O for user interaction
- Plain text `.txt` file storing word list

---

## 📂 Repository Structure

```
Wordle-game/
├── Wordle.java # Entry point and core game logic
├── engDict.txt # English dictionary
├── Words.txt # List of valid 5-letter words
└── README.md # Project documentation
```


---

## 🚀 Getting Started

### Requirements:
- JDK 8 or higher installed
- Terminal or command prompt access

### To Run The Game:
```bash
git clone https://github.com/Khanakag-17/Wordle-game.git
cd Wordle-game
javac Wordle.java
java Wordle
```
## 📘 How to Play

- Run `java Main`.
- Enter any 5-letter guess within 6 tries.
- See your feedback and guess again.
- Win if you guess in 6 tries—otherwise, the word is revealed.

---

## 🧠 Extending the Game

- Add a GUI using Java Swing or JavaFX.
- Implement difficulty levels (longer words, fewer attempts).
- Support daily words via a file or seeded randomness.

---

## 🙋‍♀️ Author

**Khanak Agrawal**  
🔗 [LinkedIn](https://www.linkedin.com/in/khanak-agrawal-361277210/)  
💻 Passionate about intelligent systems and engaging user experiences.
