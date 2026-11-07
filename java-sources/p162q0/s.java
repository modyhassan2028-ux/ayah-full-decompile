package p162q0;

import A6.a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class s {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final s f21228r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final s f21229s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final s f21230t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final s f21231u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final /* synthetic */ s[] f21232v;

    static {
        s sVar = new s("Active", 0);
        f21228r = sVar;
        s sVar2 = new s("ActiveParent", 1);
        f21229s = sVar2;
        s sVar3 = new s("Captured", 2);
        f21230t = sVar3;
        s sVar4 = new s("Inactive", 3);
        f21231u = sVar4;
        f21232v = new s[]{sVar, sVar2, sVar3, sVar4};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f21232v.clone();
    }

    public final boolean a() {
        int iOrdinal = ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                return false;
            }
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return false;
                }
                throw new a();
            }
        }
        return true;
    }
}
