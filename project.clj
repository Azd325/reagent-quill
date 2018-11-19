(defproject machtfit/reagent-quill "1.0.0-SNAPSHOT"
  :description "Reagent wrapper around react-quill"

  :url "https://github.com/machtfit/reagent-quill.git"

  :dependencies [[org.clojure/clojure "1.9.0" :scope "provided"]
                 [org.clojure/clojurescript "1.10.339" :scope "provided"]
                 [cljsjs/react "16.6.0-0" :scope "provided"]
                 [cljsjs/react-dom "16.6.0-0" :scope "provided"]
                 [cljsjs/react-dom-server "16.6.0-0" :scope "provided"]
                 [reagent "0.8.1" :scope "provided"]]

  :plugins [[lein-cljsbuild "1.1.4"
             :exclusions [org.clojure/clojure]]
            [lein-figwheel "0.5.4-7"]]

  :deploy-repositories [["releases" :clojars]]

  :source-paths ["src"]

  :figwheel {:server-port 3450
             :css-dirs    ["resources/public/css"]}

  :cljsbuild {:builds {:app
                       {:source-paths ["src" "env/dev/cljs"]
                        :figwheel     true
                        :compiler     {:main          "reagent-quill.dev"
                                       :asset-path    "js/out"
                                       :output-to     "resources/public/js/app.js"
                                       :output-dir    "resources/public/js/out"
                                       :source-map    true
                                       :optimizations :none
                                       :pretty-print  true
                                       :foreign-libs  [{:file     "src/vendor/bundle.js"
                                                        :file-min "src/vendor/bundle.min.js"
                                                        :provides ["react-quill"]}]
                                       }}
                       :release
                       {:source-paths ["src" "env/prod/cljs"]
                        :compiler
                        {:output-to     "dist/reagent-quill.js"
                         :output-dir    "dist/"
                         :asset-path    "js/out"
                         :foreign-libs  [{:file     "src/vendor/bundle.js"
                                          :file-min "src/vendor/bundle.min.js"
                                          :provides ["react-quill"]}]
                         :optimizations :advanced
                         :pretty-print  false}}}})
