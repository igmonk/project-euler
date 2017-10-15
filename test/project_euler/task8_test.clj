(ns project-euler.task8-test
  (:require [clojure.test :refer :all]
            [project-euler.task8 :refer :all]))

(deftest task8-test
  (testing "Task8"
    (is (= 23514624000 (execute)))))
