package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.h2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0823h2 implements Cloneable {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final AbstractC0828i2 f14328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public AbstractC0828i2 f14329s;

    public AbstractC0823h2(AbstractC0828i2 abstractC0828i2) {
        this.f14328r = abstractC0828i2;
        if (abstractC0828i2.e()) {
            throw new IllegalArgumentException("Default instance must be immutable.");
        }
        this.f14329s = (AbstractC0828i2) abstractC0828i2.o(4);
    }

    public static void a(int i10, List list) {
        int size = list.size() - i10;
        StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 26);
        sb.append("Element at index ");
        sb.append(size);
        sb.append(" is null.");
        String string = sb.toString();
        int size2 = list.size();
        while (true) {
            size2--;
            if (size2 < i10) {
                throw new NullPointerException(string);
            }
            list.remove(size2);
        }
    }

    public final void b() {
        if (this.f14329s.e()) {
            return;
        }
        AbstractC0828i2 abstractC0828i2 = (AbstractC0828i2) this.f14328r.o(4);
        H2.f14042c.a(abstractC0828i2.getClass()).d(abstractC0828i2, this.f14329s);
        this.f14329s = abstractC0828i2;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final AbstractC0823h2 clone() {
        AbstractC0823h2 abstractC0823h2 = (AbstractC0823h2) this.f14328r.o(5);
        abstractC0823h2.f14329s = d();
        return abstractC0823h2;
    }

    public final AbstractC0828i2 d() {
        if (!this.f14329s.e()) {
            return this.f14329s;
        }
        this.f14329s.g();
        return this.f14329s;
    }

    public final AbstractC0828i2 e() {
        AbstractC0828i2 abstractC0828i2D = d();
        abstractC0828i2D.getClass();
        boolean zH = true;
        byte bByteValue = ((Byte) abstractC0828i2D.o(1)).byteValue();
        if (bByteValue != 1) {
            if (bByteValue == 0) {
                zH = false;
            } else {
                zH = H2.f14042c.a(abstractC0828i2D.getClass()).h(abstractC0828i2D);
                abstractC0828i2D.o(2);
            }
        }
        if (zH) {
            return abstractC0828i2D;
        }
        throw new A6.a("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final void f(AbstractC0828i2 abstractC0828i2) {
        AbstractC0828i2 abstractC0828i3 = this.f14328r;
        if (abstractC0828i3.equals(abstractC0828i2)) {
            return;
        }
        if (!this.f14329s.e()) {
            AbstractC0828i2 abstractC0828i4 = (AbstractC0828i2) abstractC0828i3.o(4);
            H2.f14042c.a(abstractC0828i4.getClass()).d(abstractC0828i4, this.f14329s);
            this.f14329s = abstractC0828i4;
        }
        AbstractC0828i2 abstractC0828i5 = this.f14329s;
        H2.f14042c.a(abstractC0828i5.getClass()).d(abstractC0828i5, abstractC0828i2);
    }

    public final void g(byte[] bArr, int i10, C0793b2 c0793b2) throws C0872r2 {
        if (!this.f14329s.e()) {
            AbstractC0828i2 abstractC0828i2 = (AbstractC0828i2) this.f14328r.o(4);
            H2.f14042c.a(abstractC0828i2.getClass()).d(abstractC0828i2, this.f14329s);
            this.f14329s = abstractC0828i2;
        }
        try {
            K2 k2A = H2.f14042c.a(this.f14329s.getClass());
            AbstractC0828i2 abstractC0828i3 = this.f14329s;
            W1 w9 = new W1();
            c0793b2.getClass();
            k2A.c(abstractC0828i3, bArr, 0, i10, w9);
        } catch (C0872r2 e10) {
            throw e10;
        } catch (IOException e11) {
            throw new RuntimeException("Reading from byte array should not throw IOException.", e11);
        } catch (IndexOutOfBoundsException unused) {
            throw new C0872r2("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }
}
