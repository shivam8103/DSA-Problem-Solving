
# 📘 HOW TO WORK WITH GITHUB REPO IN VS CODE

## 🌐 1. HOW TO CLONE A REPOSITORY

- Go to your repository on GitHub.
- Click the green **Code** button.
- Select **HTTPS** and copy the link.

Example:
```
https://github.com/your-username/DSA-Problem-Solving.git
```

### 💻 In VS Code:
- Open the Command Palette: `Ctrl + Shift + P`
- Type `Git: Clone`
- Paste the copied URL
- Choose the folder where you want to save it
- Click “Open” when it asks to open the repo

**Alternatively, in terminal:**
```bash
git clone https://github.com/shivam8103/DSA-Problem-Solving.git
cd DSA-Problem-Solving
```

---
## 📊 Step 1. CHECK STATUS

To check what’s changed or what’s pending:
```bash
git status
```

---

## 🛠️ Step 2. STAGE CHANGES

Use this command to add changes you made (new or edited files):
```bash
git add .
```

`.` means you’re staging all modified files.

Or add specific files:
```bash
git add README.md
```

---

## 📝 Step 3. COMMIT CHANGES

Once staged, commit the changes with a message:
```bash
git commit -m "Added solution for 001"
```

---

## 📤 Step 4. PUSH CHANGES TO GITHUB

To push your commits to GitHub:

If it's your first push:
```bash
git push -u origin main
```

Next time (normal push):
```bash
git push
```

---
## 📌 RECOMMENDED WORKFLOW SUMMARY

```bash
git status
git add .
git commit -m "Your message"
git push
```

**Always pull before starting work:**
```bash
git pull
```

---
## 🔍 BONUS: CHECK USER CONFIG

If you're seeing the wrong GitHub account name or email in the commit history, or if a commit made by you is not appearing under your GitHub account, here's what to do:

Update username and email:
```bash
git config user.name "shivam8103"
git config user.email "shivam.sinha0810@gmail.com"
```

Set globally (for all projects):
```bash
git config --global user.name "shivam8103"
git config --global user.email "shivam.sinha0810@gmail.com"
```

---


## ✅ BONUS: CHECK REMOTE CONFIGURATION

Use this to check where your local Git repository is connected (i.e., the remote URLs for fetch and push):

```bash
git remote -v
```

This confirms:

- ✅ The **remote GitHub URL** your repository is connected to
- ✅ That both **fetch** (getting updates) and **push** (sending changes) are properly set up

### 🔍 Example Output:
```bash
origin  https://github.com/shivam8103/DSA-Problem-Solving.git (fetch)
origin  https://github.com/shivam8103/DSA-Problem-Solving.git (push)
```

If the remote is incorrect or needs to be updated, use the following command:

```bash
git remote set-url origin https://github.com/your-username/your-repo-name.git
```
---

## 🧠 TIPS

- To check all commits 
```bash
git log
```
- To check all commits in line
```bash
git log --oneline
```
- To check last n (say 5) commits
```bash
git log --oneline -n 5
```

---

📅 *Guide by Shivam — Created for my DSA GitHub Journey | July 2025*
