(ns archi-example.example
  (:use [archi.core]))

(defnodes Archi Clojure DSL Tangle Graphviz SVG HTML JavaScript Browser)

(def features [(feature ["Describing"] [DSL Clojure Archi])
               (feature ["Rendering"]
                        ["Render" Archi Tangle Graphviz]
                        ["Generate SVG" Graphviz SVG]
                        ["Fix SVG" Archi SVG]
                        ["Wrap HTML interaction" SVG Archi HTML])
               (feature ["Interaction"] ["View" Browser HTML JavaScript])])

(defn -main [& args]
  (render! features))
