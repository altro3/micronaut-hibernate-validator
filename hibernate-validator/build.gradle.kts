plugins {
    id("io.micronaut.build.internal.module")
}
dependencies {
    annotationProcessor(mn.micronaut.graal)
    annotationProcessor(mn.micronaut.inject.java)
    compileOnly(libs.glassfish.el)
    compileOnly(mn.micronaut.router)
    implementation(libs.hibernate.validator)
    implementation(mn.micronaut.inject)
    implementation(mn.micronaut.validation)
    runtimeOnly(libs.glassfish.jakarta.el)

    testAnnotationProcessor(mn.micronaut.inject.java)
    testCompileOnly(mn.micronaut.inject.groovy)
    testImplementation(mn.micronaut.http.server.netty)
}
