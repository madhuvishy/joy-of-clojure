;The fun graphics program from Chapter 3

(def frame (java.awt.Frame.))
(.setVisible frame true)
(.setSize frame 200 200)
(def gfx (.getGraphics frame))
(defn clear[g x y] (.clearRect g 0 0 x y))

(defn f-values [f xmax ymax]
  (for [x (range xmax) y (range ymax)]
    [x y (rem (f x y) 256)]))

(defn draw-values [f xmax ymax]
  (clear gfx xmax ymax)
  (.setSize frame xmax ymax)
  (doseq [[x y v] (f-values f xmax ymax)]
    (.setColor gfx (java.awt.Color. v v v))
    (.fillRect gfx x y 1 1)
  )
)

(draw-values bit-and 250 250)



