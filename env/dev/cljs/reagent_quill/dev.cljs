(ns ^:figwheel-no-load reagent-quill.dev
  (:require [reagent.core :as reagent]
            [reagent-quill.core :as core]
            [figwheel.client :as figwheel :include-macros true]))

(enable-console-print!)

(figwheel/watch-and-reload
  :websocket-url "ws://localhost:3450/figwheel-ws"
  :jsload-callback core/mount-root)

(defn boot-demo-app []
  (reagent/render [core/quill-component {:theme "snow"}] (.getElementById js/document "app")))

(boot-demo-app)
