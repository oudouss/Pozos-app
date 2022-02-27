# Pozos-app
The objective of this project is to have a CI/CD pipeline, in which if we make changes to our GitHub repo, Jenkins will automatically trigger the build and the tests, then it will create an image docker with the build code, then send it from docker image to docker registry and finally deploy to our server with ansible.
