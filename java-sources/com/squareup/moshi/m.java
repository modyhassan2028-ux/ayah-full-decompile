package com.squareup.moshi;

import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f15447a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Da.p f15448b;

    public m(String[] strArr, Da.p pVar) {
        this.f15447a = strArr;
        this.f15448b = pVar;
    }

    public static m a(String... strArr) {
        try {
            Da.k[] kVarArr = new Da.k[strArr.length];
            Da.h hVar = new Da.h();
            for (int i10 = 0; i10 < strArr.length; i10++) {
                q.c0(hVar, strArr[i10]);
                hVar.readByte();
                kVarArr[i10] = hVar.k(hVar.f1362s);
            }
            return new m((String[]) strArr.clone(), p000a.a.R(kVarArr));
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}
