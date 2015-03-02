(ns euler-32.core
  (:gen-class))

(defn as-digits
  "Takes a number (num) and returns a collection where each member of the collection is a digit from num."
  [num]
  (map #(Character/getNumericValue %) (str num)))

(defn sum-of-fifth-powers
  [num]
  (= num (reduce + (map #(math/expt % 5) (as-digits num)))))

(defn euler-32
  []
  (reduce + (filter sum-of-fifth-powers (range 100000000 1000000000))))


