package p020c;

import android.content.res.Resources;
import p241y9.c;
import p251z9.j;
import p251z9.k;

/* JADX INFO: loaded from: classes.dex */
public final class G extends k implements c {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final G f13362r = new G(1);

    @Override // p241y9.c
    public final Object e(Object obj) {
        Resources resources = (Resources) obj;
        j.e(resources, "resources");
        return Boolean.valueOf((resources.getConfiguration().uiMode & 48) == 32);
    }
}
