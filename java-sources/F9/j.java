package F9;

import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class j extends p251z9.h implements p241y9.c {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final j f2545z = new j(1, n.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);

    @Override // p241y9.c
    public final Object e(Object obj) {
        Type type = (Type) obj;
        p251z9.j.e(type, "p0");
        return n.e(type);
    }
}
