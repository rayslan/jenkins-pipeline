node {
    properties([buildDiscarder(logRotator(artifactDaysToKeepStr: '', artifactNumToKeepStr: '', daysToKeepStr: '', numToKeepStr: '2'))])


    timestamps {
        

        stage('Download Repo') {
             sh 'echo \'Hello\''
             }

            stage('Download Repo2') {
             sh 'echo \'Hello34234\''
             }

             stage('Download Repo2') {
             sh 'echo \'Hello342dfhndfhdf34\''
             }

        

    

}
}
