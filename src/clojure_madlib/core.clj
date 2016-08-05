(ns clojure-madlib.core)

;; http://www.glowwordbooks.com/blog/2015/04/06/online-kids-madlibs-pizza-party/
;; I just got back from a pizza party with . Can you believe we got to eat pizza in ?! Everyone got to choose their own toppings. I made ' and ' pizza, which is my favorite! They even stuffed the crust with . How ! If that wasn't good enough already, was there singing . I was so inspired by the music, I had to get up out of my seat and .
;; I just got back from a pizza party with (person-1). Can you believe we got to eat (adj-1) pizza in (place-1)?! Everyone got to choose their own toppings. I made '(food-1) and (things-plural-1)' pizza, which is my favorite! They even stuffed the crust with (things-plural-2). How (adjective2-1)! If that wasn't good enough already, (celebrity-1) was there singing (song-title-1). I was so inspired by the music, I had to get up out of my seat and (verb-1).
;; http://thornydev.blogspot.com/2012/10/reading-user-input-from-stdin-in-clojure.html

(defn -main []
    ;; define arguments
    (def adjective "luscious")
    (def things1 "laptops")
    (def things2 "cats")
    (def song-title "Bohemian Rhapsody")
    (def celebrity "Michael Bolton")
    (def adjective2 "smooth")
    (def verb "vomit")
    (def city "Rugby, ND")
    (def food "watermelon")
    (def person "George Washington")

    ;; define method mad-lib
    (defn mad-lib [adj-1 things-plural-1 song-title-1 celebrity-1 adj-2 verb-1 city-1 food-1 things-plural-2 person-1] (str "I just got back from a pizza party with " person-1 ". Can you believe we got to eat " adj-1 " pizza in " city-1 "?! Everyone got to choose their own toppings. I made " food-1 " and " things-plural-1 " pizza, which is my favorite! They even stuffed the crust with " things-plural-2 ". How " adj-2 "! If that wasn't good enough already, " celebrity-1 " was there singing " song-title-1 ". I was so inspired by the music, I had to get up out of my seat and " verb-1 ".\n"))

    ;; call mad-lib with argument bindings
    (println (mad-lib adjective, things1, song-title, celebrity, adjective2, verb, city, food, things2, person))
)