# 🎯 LLD Practice Roadmap - Complete Guide

## 📊 Difficulty Levels

| Level | Meaning | Time to Solve |
|-------|---------|---------------|
| ⭐ | Easy - Basic OOP | 30-45 mins |
| ⭐⭐ | Medium - 1-2 Patterns | 45-60 mins |
| ⭐⭐⭐ | Hard - Multiple Patterns | 60-90 mins |
| ⭐⭐⭐⭐ | Expert - Complex Systems | 90+ mins |

---

## 🏃 PHASE 1: Foundation (Start Here!)

### Concepts to Master First:
- [ ] Classes & Objects
- [ ] Encapsulation (private fields, public methods)
- [ ] Inheritance vs Composition
- [ ] Interfaces & Abstract Classes
- [ ] Enums

### Practice Problems:

| # | Problem | Difficulty | Key Concepts | Status |
|---|---------|------------|--------------|--------|
| 1 | **Tic-Tac-Toe** | ⭐ | OOP basics, Game loop | ✅ Done |
| 2 | **Parking Lot** | ⭐ | Classes, Enums, Basic logic | ⬜ |
| 3 | **Library Management** | ⭐ | CRUD operations, Relationships | ⬜ |
| 4 | **Stack Overflow (Simple)** | ⭐ | User, Question, Answer models | ⬜ |
| 5 | **ATM Machine** | ⭐⭐ | State, Transactions | ⬜ |

---

## 🏃‍♂️ PHASE 2: Design Patterns

### Patterns to Master:

**Creational (Object Creation):**
- [ ] Builder Pattern
- [ ] Factory Pattern  
- [ ] Singleton Pattern
- [ ] Prototype Pattern

**Structural (Object Composition):**
- [ ] Decorator Pattern
- [ ] Adapter Pattern
- [ ] Facade Pattern

**Behavioral (Object Communication):**
- [ ] Strategy Pattern
- [ ] Observer Pattern
- [ ] State Pattern
- [ ] Command Pattern

### Practice Problems:

| # | Problem | Difficulty | Key Patterns | Status |
|---|---------|------------|--------------|--------|
| 6 | **Snake & Ladder** | ⭐⭐ | Strategy, Factory | ⬜ |
| 7 | **Elevator System** | ⭐⭐ | State, Strategy, Observer | ⬜ |
| 8 | **Vending Machine** | ⭐⭐ | State Pattern | ⬜ |
| 9 | **Logger System** | ⭐⭐ | Singleton, Chain of Responsibility | ⬜ |
| 10 | **Cache System (LRU)** | ⭐⭐ | Singleton, Strategy | ⬜ |
| 11 | **File System** | ⭐⭐ | Composite Pattern | ⬜ |
| 12 | **Notification System** | ⭐⭐ | Observer, Factory | ⬜ |

---

## 🏃‍♀️ PHASE 3: Advanced Systems

### Practice Problems:

| # | Problem | Difficulty | Key Patterns | Status |
|---|---------|------------|--------------|--------|
| 13 | **BookMyShow** | ⭐⭐⭐ | Multiple patterns, Concurrency | ⬜ |
| 14 | **Splitwise** | ⭐⭐⭐ | Strategy, Observer | ⬜ |
| 15 | **Chess Game** | ⭐⭐⭐ | Strategy, State, Command | ⬜ |
| 16 | **Hotel Booking** | ⭐⭐⭐ | Builder, Strategy, Observer | ⬜ |
| 17 | **Food Delivery (Zomato)** | ⭐⭐⭐ | Multiple patterns | ⬜ |
| 18 | **Ride Sharing (Uber)** | ⭐⭐⭐⭐ | Strategy, Observer, State | ⬜ |
| 19 | **Stock Exchange** | ⭐⭐⭐⭐ | Observer, Command, Strategy | ⬜ |
| 20 | **Rate Limiter** | ⭐⭐⭐ | Strategy, Singleton | ⬜ |

---

## 📚 SOLID Principles Quick Reference

```
S - Single Responsibility
    → One class = One job
    → Example: Player class only stores player info

O - Open/Closed
    → Open for extension, closed for modification
    → Example: Add new WinningStrategy without changing Game

L - Liskov Substitution
    → Child class should work wherever parent works
    → Example: Any WinningStrategy can replace another

I - Interface Segregation
    → Many small interfaces > One big interface
    → Example: Separate Movable, Attackable interfaces

D - Dependency Inversion
    → Depend on abstractions, not concretions
    → Example: Game depends on WinningStrategy interface
```

---

## 🎮 How to Approach Any LLD Problem

### Step-by-Step Process:

```
1️⃣ GATHER REQUIREMENTS (5 mins)
   └── Ask clarifying questions
   └── List all features needed
   └── Identify constraints

2️⃣ IDENTIFY ENTITIES (5 mins)
   └── Find nouns in requirements → Classes
   └── Find verbs → Methods
   └── Find adjectives → Attributes

3️⃣ DEFINE RELATIONSHIPS (5 mins)
   └── Has-A (Composition): Car HAS-A Engine
   └── Is-A (Inheritance): Dog IS-A Animal
   └── Uses-A: Game USES WinningStrategy

4️⃣ APPLY PATTERNS (10 mins)
   └── Complex creation? → Builder/Factory
   └── Multiple algorithms? → Strategy
   └── State changes? → State Pattern
   └── Notifications? → Observer

5️⃣ WRITE CODE (30+ mins)
   └── Start with Enums
   └── Then simple model classes
   └── Then complex classes
   └── Finally, main controller

6️⃣ OPTIMIZE & DISCUSS (5 mins)
   └── Time/Space complexity
   └── Future extensions
   └── Trade-offs
```

---

## 📝 Template for Solving LLD Problems

### 1. Requirements Template
```
Functional Requirements:
- FR1: System should...
- FR2: User can...
- FR3: Admin can...

Non-Functional Requirements:
- Scalability: ...
- Concurrency: ...
```

### 2. Entity Template
```
Entities Identified:
1. Entity1
   - Attributes: a, b, c
   - Methods: doX(), doY()
   
2. Entity2
   - Attributes: x, y
   - Methods: doZ()
```

### 3. Class Diagram Template
```
┌─────────────┐      ┌─────────────┐
│   Class1    │──────│   Class2    │
├─────────────┤      ├─────────────┤
│ -attribute1 │      │ -attribute2 │
├─────────────┤      ├─────────────┤
│ +method1()  │      │ +method2()  │
└─────────────┘      └─────────────┘
```

---

## ⏰ Daily Practice Schedule

```
Week 1-2: Foundation
├── Day 1-2: Review OOP concepts
├── Day 3-4: Solve Parking Lot
├── Day 5-6: Solve Library Management
└── Day 7: Review & revise

Week 3-4: Design Patterns
├── Day 1-2: Learn Builder, Factory
├── Day 3-4: Solve Snake & Ladder
├── Day 5-6: Learn Strategy, Observer
├── Day 7-8: Solve Elevator System
├── Day 9-10: Learn State Pattern
├── Day 11-12: Solve Vending Machine
└── Day 13-14: Review all patterns

Week 5-6: Advanced
├── Day 1-3: BookMyShow
├── Day 4-6: Splitwise
├── Day 7-9: Chess
├── Day 10-12: Food Delivery
└── Day 13-14: Mock interviews
```

---

## 🔗 Resources

### YouTube Channels:
- Code with Aryan (Hindi)
- Concept && Coding (Hindi)
- Sudocode (English)

### Practice Platforms:
- GitHub: awesome-low-level-design
- LeetCode: Design problems
- InterviewReady

### Books:
- Head First Design Patterns
- Clean Code by Uncle Bob

---

## ✅ Progress Tracker

Use this to track your progress:

```
[ ] Phase 1: Foundation
    [x] Tic-Tac-Toe
    [ ] Parking Lot
    [ ] Library Management
    [ ] ATM Machine

[ ] Phase 2: Patterns
    [ ] Snake & Ladder
    [ ] Elevator System
    [ ] Vending Machine
    [ ] Logger System

[ ] Phase 3: Advanced
    [ ] BookMyShow
    [ ] Splitwise
    [ ] Chess
    [ ] Food Delivery
```

---

## 🎯 Next Recommended Problem: PARKING LOT

Why Parking Lot next?
- Uses similar concepts to Tic-Tac-Toe
- Introduces new concepts: Multiple vehicle types, Slots
- Good practice for SOLID principles
- Very commonly asked in interviews!

Ready to solve Parking Lot? 🚗