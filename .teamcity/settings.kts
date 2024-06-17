import no.elhub.devxp.build.configuration.pipeline.ElhubProject.Companion.elhubProject
import no.elhub.devxp.build.configuration.pipeline.constants.Group.DEVXP
import no.elhub.devxp.build.configuration.pipeline.jobs.makeVerify

elhubProject(DEVXP, "devxp-project-template") {
    pipeline {
        sequential {
            makeVerify {
                disableSonarScan = true
            }
        }
    }
}
