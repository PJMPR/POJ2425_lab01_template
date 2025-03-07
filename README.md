# **Zaawansowane zadania na pierwsze laboratorium z Javy**

## **1. Operacje na liczbach i warunki (`if-else`, `switch`)**

### **Zadanie 1.1 – Liczba doskonała**
**Opis:** Napisz program, który sprawdzi, czy podana liczba całkowita jest **liczbą doskonałą**.
- *Liczba doskonała* to taka liczba, która jest równa sumie swoich dzielników (bez niej samej).
- *Przykład:* `6` → dzielniki: `1, 2, 3`, suma = `6` → liczba doskonała ✅

### **Zadanie 1.2 – Kalkulator z `switch-case`**
**Opis:** Napisz **prosty kalkulator**, który:
- Wczytuje dwie liczby,
- Pyta użytkownika o rodzaj operacji (`+, -, *, /`),
- Wykonuje obliczenie przy użyciu **`switch-case`**.

---

## **2. Pętle (`for`, `while`, `do-while`)**

### **Zadanie 2.1 – Liczby pierwsze w zakresie**
**Opis:** Napisz program, który wczytuje dwie liczby `A` i `B`, a następnie wypisuje **wszystkie liczby pierwsze w tym zakresie**.
- *Przykład:* `A = 10`, `B = 20` → `11, 13, 17, 19`

### **Zadanie 2.2 – Odwracanie liczby (`while`)**
**Opis:** Napisz program, który wczytuje liczbę całkowitą i wypisuje ją **od tyłu**.
- *Przykład:* `12345` → `54321`

---

## **3. Tablice i Stringi**

### **Zadanie 3.1 – Suma liczb w tablicy**
**Opis:** Napisz program, który:
- Wczytuje `N` liczb do tablicy,
- Oblicza i wypisuje sumę wszystkich elementów,
- Oblicza **średnią arytmetyczną**.

### **Zadanie 3.2 – Najczęściej występujący znak w Stringu**
**Opis:** Napisz program, który dla podanego **ciągu znaków** znajdzie **najczęściej występujący znak**.
- *Przykład:* `"programowanie"` → `o` (występuje najczęściej)
- **Wskazówka:** Użyj tablicy `int[256]` do zliczania wystąpień znaków.

---

## **4. Rekursja – Trochę więcej myślenia!**

### **Zadanie 4.1 – Silnia (`n!`) rekurencyjnie**
**Opis:** Napisz funkcję rekurencyjną, która oblicza **silnię** liczby `n`.
- *Przykład:* `5! = 5 × 4 × 3 × 2 × 1 = 120`

### **Zadanie 4.2 – Ciąg Fibonacciego rekurencyjnie**
**Opis:**         Użytkownik wprowadza z klawiatury liczbę kotów, które posiada pani Ala.
        Napisz program który poprawnie wyświetli zdanie typu 'Ala ma kota'

- *Przykład:* dla liczby 1 - "Ala ma jednego kota"
            dla liczby 2 - "Ala ma 2 koty"
            dla liczby 9 - "Ala ma 9 kotów"
            dla liczby 23 - "Ala ma 23 koty"
            dla liczby 25 - "Ala ma 25 kotów"
            dla liczby 11 - "Ala ma 11 kotów"
            dla liczby 12 - "Ala ma 12 kotów"
            dla liczby 16 - "Ala ma 16 kotów"
            dla liczby 21 - "Ala ma 21 kotów"
            dla liczby 23 - "Ale ma 23 koty"
            dla liczby 26 - "Ale ma 26 kotów"
            dla liczby 112 - "Ale ma 112 kotów"
            dla liczby 1123 - "Ale ma 1123 koty"
