(ns tcx-fixer.core)

(defn tcx->map [input]
  (let [root (-> input
                 io/input-stream
                 xml/parse
                 zip/xml-zip)]
    ))
