(ns project-euler.task1-test
  (:require [clojure.test :refer :all]
            [project-euler.task1 :refer :all]))

(deftest task1-test
  (testing "Task1"
    (is (= 233168 (get-sum)))))
