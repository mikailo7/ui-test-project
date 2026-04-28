package tests

import com.intellij.ide.starter.runner.Starter
import com.intellij.ide.starter.models.TestCase
import com.intellij.ide.starter.project.GitHubProject
import com.intellij.ide.starter.ide.IdeProductProvider
import com.intellij.tools.ide.performanceTesting.commands.CommandChain
import org.junit.jupiter.api.Test

class MySettingsTest {

    @Test
    fun testEnableAutoChangelist() {

        val testCase = TestCase(
            IdeProductProvider.IC,
            GitHubProject.fromGithub(
                branchName = "master",
                repoRelativeUrl = "JetBrains/intellij-community"
            )
        )

        val context = Starter.newContext("settings-test", testCase)

        val commands = CommandChain()
            .addCommand("openSettings")
            .addCommand("selectSettingsPage Version Control")
            .addCommand("selectSettingsPage Changelists")
            .addCommand("checkBox Create changelists automatically true")
            .addCommand("pressButton OK")

        context.runIDE {
            it.commandChain(commands)
        }
    }
}