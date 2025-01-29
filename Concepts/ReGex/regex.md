Here’s your content converted into Markdown format:

```markdown
# Regex Basics: Rules and Concepts

## Basic Components

- **Literals**: Characters that match themselves.
  - **Example**: `a` matches the character 'a'.

- **Metacharacters**: Characters with special meanings.
  - **Common metacharacters**: `. ^ $ * + ? { } [ ] \ | ( )`

---

## Special Characters

- **Dot (`.`)**: Matches any single character except newline.
  - **Example**: `a.b` matches 'aab', 'acb', etc.

- **Caret (`^`)**: Matches the start of a string.
  - **Example**: `^abc` matches 'abc' only if it is at the beginning of the string.

- **Dollar (`$`)**: Matches the end of a string.
  - **Example**: `abc$` matches 'abc' only if it is at the end of the string.

---

## Quantifiers

- **Asterisk (`*`)**: Matches 0 or more occurrences of the preceding element.
  - **Example**: `a*` matches '', 'a', 'aa', etc.

- **Plus (`+`)**: Matches 1 or more occurrences of the preceding element.
  - **Example**: `a+` matches 'a', 'aa', etc.

- **Question Mark (`?`)**: Matches 0 or 1 occurrence of the preceding element.
  - **Example**: `a?` matches '' or 'a'.

- **Braces (`{n,m}`)**: Matches between `n` and `m` occurrences of the preceding element.
  - **Example**: `a{2,4}` matches 'aa', 'aaa', or 'aaaa'.

---

## Character Classes

- **Square Brackets (`[ ]`)**: Matches any one of the enclosed characters.
  - **Example**: `[abc]` matches 'a', 'b', or 'c'.

- **Negation (`[^ ]`)**: Matches any character not in the brackets.
  - **Example**: `[^abc]` matches any character except 'a', 'b', or 'c'.

- **Ranges**: Matches any character within the specified range.
  - **Example**: `[a-z]` matches any lowercase letter.

---

## Groups and Alternation

- **Parentheses (`( )`)**: Groups multiple tokens together and remembers the matched text.
  - **Example**: `(abc)` matches 'abc'.

- **Pipe (`|`)**: Acts as a logical OR.
  - **Example**: `a|b` matches 'a' or 'b'.

---

## Escaping

- **Backslash (`\`)**: Escapes a metacharacter to match it literally.
  - **Example**: `\.` matches a literal dot.

---

## Examples

---

### Email Validation
```
^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}$
```



### Phone Number (US)

```
^\(\d{3}\) \d{3}-\d{4}$
```

### URL
```
^https?:\/\/[^\s/$.?#].[^\s]*$
```

---

## Tips
Regex can be quite powerful but also complex. Always test your patterns with various inputs to ensure they work as expected.
```