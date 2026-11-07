package p244z1;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ColorStateList f24765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Configuration f24766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f24767c;

    public g(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
        this.f24765a = colorStateList;
        this.f24766b = configuration;
        this.f24767c = theme == null ? 0 : theme.hashCode();
    }
}
