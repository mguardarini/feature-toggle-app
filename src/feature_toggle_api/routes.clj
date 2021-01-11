(ns feature_toggle_api.routes
  (:require
            [compojure.core :refer :all]
            [compojure.route :as route]
            [feature_toggle_api.user.user :as user])
  (:gen-class))



(defroutes app-routes
           (GET "/" [] "Hi Lorena")
           (POST "user" [userData] #'user/createUser userData)
           (route/not-found "Error, page not found!"))
