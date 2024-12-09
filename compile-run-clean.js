const { execSync } = require('child_process')
const path = require('path')
const fs = require('fs')

const file = process.argv[2] || 'Main.kt'
const kotlinFile = path.resolve('src/', file.endsWith('.kt') ? file : `${file}.kt`) // Add .kt if not present
const jarFile = 'Main.jar'
const quotedKotlinFile = `"${kotlinFile}"`
const quotedJarFile = `"${jarFile}"`

try {
    // Compile the Kotlin file into a JAR
    execSync(`kotlinc ${quotedKotlinFile} -include-runtime -d ${quotedJarFile}`, {
        stdio: 'inherit'
    })
    
    // Run the JAR file
    execSync(`java -jar ${quotedJarFile}`, {
        stdio: 'inherit'
    })
} catch (err) {
    console.log(`Error during compilation or execution: ${err.message}`)
} finally {
    // Clean up the JAR file after execution
    if (fs.existsSync(jarFile)) {
        fs.unlinkSync(jarFile)
    }
}
