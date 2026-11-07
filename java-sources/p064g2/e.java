package p064g2;

import p056f2.AbstractComponentCallbacksC0947u;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public abstract class e extends RuntimeException {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractComponentCallbacksC0947u f16272r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(AbstractComponentCallbacksC0947u abstractComponentCallbacksC0947u, String str) {
        super(str);
        j.e(abstractComponentCallbacksC0947u, "fragment");
        this.f16272r = abstractComponentCallbacksC0947u;
    }
}
