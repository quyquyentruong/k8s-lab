# Read Me First
Build project k8s:

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* Run in VM host:
- Create configmap to load file .properties to k8s env
#kubectl create configmap app-prod-config --from-file=application-prod.properties

- If configmap exist, please delete configmap before create again

* Delete proper deployment before create 
#kubectl apply -f deployment.yaml

* Create service for deployment:
#k expose deployment java-backend-01 --port 8081 --target-port 8081