# 🚀 Regex and JUnit — User Registration Validation

## 📋 Problem Description

This repository contains a solution to a classic **User Registration Validation** problem, designed to validate user input fields based on specific business rules using **Regular Expressions (Regex)** in Java.

The core task was to implement validation logic for common registration form fields and write comprehensive **JUnit 5 test cases** to verify that the validation behaves correctly under various input scenarios.

---

## 🎯 Problem Statement

Design a user registration system where each input field must satisfy precise validation criteria:

| Field         | Validation Rules                                     | Regex Pattern                                |
|---------------|----------------------------------------------------|----------------------------------------------|
|  First Name    | Starts with a capital letter, minimum 3 characters | `^[A-Z][a-zA-Z]{2,}$`                        |
|  Last Name     | Same rules as First Name                            | `^[A-Z][a-zA-Z]{2,}$`                        |
|  Email         | Follow strict email format validation with regex   | `^[a-zA-Z0-9]+([._+-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,4}(\\.[a-zA-Z]{2,4})?$` |
|  Phone Number  | Country code followed by space and 10 digit number | `^[0-9]{1,3} [0-9]{10}$`                      |
|  Password      | Minimum 8 characters, at least one uppercase, one number, one special character | `^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$` |

The goal is to **enforce input correctness** at the time of registration, minimizing invalid data entries and improving data quality.

---

## 🛠️ Solution Overview

### ✅ Validation Implementation

- Implemented each validation as a method returning boolean indicating valid/invalid.
- Leveraged carefully crafted regex patterns for concise yet robust validation.
- Ensured reusability and readability by separating each field's validation into its own method.

### 🧪 Testing Strategy

- Created a JUnit 5 test class containing multiple test methods to verify every validation rule.
- Included positive test cases to confirm valid inputs pass.
- Added negative test cases to catch invalid inputs and edge cases.
- Used parameterized tests for email validation to check a wide variety of email formats efficiently.
- Employed meaningful test method names describing what is tested and expected outcome.

---

## 💡 Importance of testing

Input validation is foundational in any user-facing system to:

- Prevent invalid or malicious data from entering the system.
- Enhance user experience by providing immediate feedback.
- Ensure downstream processes rely on clean, expected input formats. 

By combining regex validation with exhaustive testing, this solution provides a blueprint for:

- Developing robust input validation in Java.
- Applying Test-Driven Development (TDD) principles.
- Writing maintainable, scalable test suites.

---


## ⚙️ JUnit Maven Dependency

To get started with JUnit in your Maven project, include the following in your `pom.xml`:

```xml
<dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-params</artifactId>
        <version>5.10.0</version>
        <scope>test</scope>
    </dependency>
</dependencies>
```

## 🧪 Sample Test Case
```xml
import org.junit.jupiter.api.Test;
        import static org.junit.jupiter.api.Assertions.*;

        class MathUtilsTest {

        @Test
        void testAddition() {
        assertEquals(4, 2 + 2, "2 + 2 should equal 4");
        }
        }
```
## 🚀 How to Run Tests

To execute all JUnit test cases in this Maven project, simply run:

```xml
mvn test
```


