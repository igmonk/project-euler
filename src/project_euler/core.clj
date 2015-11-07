(ns project-euler.core
  (:gen-class)
  (:require [project-euler.task1 :as task1])
  (:require [project-euler.task2 :as task2])
  (:require [project-euler.task3 :as task3])
  (:require [project-euler.task4 :as task4]))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!")
  "(prn (task1/get-sum))"
  "(prn (task2/even-fibs))"
  (prn (task4/largest-palindrome)))
