# factorial

# creates simple docker to run application
docker run -p 8080:8080 ifactorial:0.5

http://localhost:8080/swagger-ui.html

# k8s
* don't use minikube - use k8s built into docker
* kubectl apply -f factorial-deploy.yaml
* kubectl delete -n default deployment ifactorial
* kubectl describe deploy
* kubectl get pods -l run=ifactorial -o wide
* kubectl get pods -l run=ifactorial -o yaml | grep podIP
* kubectl apply -f factorial-service.yaml
* kubectl get svc ifactorial

* moved port to 9090 - see application properties
