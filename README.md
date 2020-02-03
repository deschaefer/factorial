# factorial

# creates simple docker to run application
docker run -p 8080:8080 ifactorial:1.1

http://localhost:8080/swagger-ui.html

# k8s
install minikube
used brew on osx
minikube start
minikube dashboard

https://hub.docker.com/repository/docker/deschaefer/ifactorial
https://hub.docker.com/repository/docker/deschaefer/ifactorial

kubectl create deployment kubernetes-bootcamp --image=gcr.io/google-samples/kubernetes-bootcamp:v1
kubectl create deployment ifactorial-node --image=docker.io/deschaefer/ifactorial
kubectl delete -n default pod ifactorial-node-8665f7fcf4-qq6q4
kubectl delete -n default deployment ifactorial-node