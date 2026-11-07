package com.squareup.moshi;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
@Retention(RetentionPolicy.RUNTIME)
public @interface i {
    boolean ignore() default false;

    String name() default "\u0000";
}
