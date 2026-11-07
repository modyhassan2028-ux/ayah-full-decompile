package dev.zacsweers.moshix.adapters;

import com.squareup.moshi.l;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* JADX INFO: loaded from: classes.dex */
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@l
public @interface AdaptedBy {
    Class<?> adapter();

    boolean nullSafe() default true;
}
