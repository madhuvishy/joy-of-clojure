;One line function to calculate largest/smallest of a vector

(defn best [f xs]
  (reduce #(if (f %1 %2) %1 %2) xs))

(best > [4 6 9 30 50 40 98 67 32 1])
