package p083ha;

import java.util.Random;
import p072ga.g;

/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f16489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f16490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Random f16491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f16492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f16493e;

    public c(b bVar, float f3) {
        Random random = new Random();
        this.f16489a = bVar;
        this.f16490b = f3;
        this.f16491c = random;
    }

    public final float a(g gVar) {
        return (((this.f16491c.nextFloat() * 2.0f) - 1.0f) * 0.5f) + 1.0f;
    }
}
