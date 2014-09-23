(ns edn-json-kata.core-test
  (:require [clojure.test :refer :all]
            [edn-json-kata.core :refer :all]))

(deftest test-edn->json
  (is (= {:one 1
          :twoTwo 2
          :threeThreeThree 3
          :SOA false}
         (edn->json {:one 1
                     :two-two 2
                     :three-three-three 3
                     :SOA false}))))
