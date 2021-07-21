node {
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '2')), 
    parameters([choice(choices: ['1.0', '2.0', '3.0', '4.0'], name: 'Choose App V'), string(defaultValue: 'IP Address', name: 'Choose Env')])])
    
    timestamps {

        stage('get repo') {
             git 'https://github.com/rayslan/terraform-aws-ec2.git'
        }

        stage('run Terraform') {
             sh '''terraform init
                terraform destroy --auto-approve'''
        }
   











}
}