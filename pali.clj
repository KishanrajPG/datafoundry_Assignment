(ns untitled.pali)
(defn palindrome [stri]
  (if (== (str (stri)) (reverse (str (stri))))

     println ("It is a palindrome")
         println ("It is not a palindrome") ))

(palindrome "madam")