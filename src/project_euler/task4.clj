(ns project-euler.task4)

(defn- reverse-number
  "Returns reversed number."
  ([source]
    (reverse-number source 0))
  ([source reversed]
    (if (= source 0)
      reversed
      (reverse-number (quot source 10)
                      (+ (* reversed 10) (rem source 10))))))

(defn- palindrome?
  "Determines whether a number is a palindrome."
  [x]
  (= x (reverse-number x)))

(defn- numbers
  "Returns lazy sequence of 3-digit numbers with descending order."
  ([] (numbers 100))
  ([to] (take-while (partial <= to) (iterate dec 999))))

(defn- numbers-optimized
  "Returns lazy sequence of 3-digit numbers with descending order.
  All members will have a factor of 11.
  p = 100000x + 10000y + 1000z + 100z + 10y + x = 11(9091x + 910y + 100z)"
  [to]
  (take-while (partial <= to) (iterate (fn [x] (- x 11)) 990)))

(defn largest-palindrome
  "Returns the largest palindrome made from the product of two 3-digit numbers."
  []
  (reduce (fn [palindrome-max a]
            (reduce (fn [p-max b]
                      (let [ab (* a b)]
                        (if (palindrome? ab) ab p-max)))
                    palindrome-max
                    (take-while (partial < (/ palindrome-max a)) (if (= (mod a 11) 0)
                                                                   (numbers a)
                                                                   (numbers-optimized a)))))
          0
          (numbers)))
