package I2;

import android.database.Cursor;
import java.util.Arrays;
import p185s8.u0;
import p251z9.j;

/* JADX INFO: loaded from: classes.dex */
public final class e extends g {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int[] f3806u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public long[] f3807v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public double[] f3808w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public String[] f3809x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte[][] f3810y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Cursor f3811z;

    public static void n(Cursor cursor, int i10) {
        if (i10 < 0 || i10 >= cursor.getColumnCount()) {
            u0.F(25, "column index out of range");
            throw null;
        }
    }

    @Override // Q2.c
    public final boolean R() {
        b();
        i();
        Cursor cursor = this.f3811z;
        if (cursor != null) {
            return cursor.moveToNext();
        }
        throw new IllegalStateException("Required value was null.");
    }

    @Override // Q2.c
    public final void c(long j, int i10) {
        b();
        e(1, i10);
        this.f3806u[i10] = 1;
        this.f3807v[i10] = j;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (!this.f3815t) {
            b();
            this.f3806u = new int[0];
            this.f3807v = new long[0];
            this.f3808w = new double[0];
            this.f3809x = new String[0];
            this.f3810y = new byte[0][];
            reset();
        }
        this.f3815t = true;
    }

    public final void e(int i10, int i11) {
        int i12 = i11 + 1;
        int[] iArr = this.f3806u;
        if (iArr.length < i12) {
            int[] iArrCopyOf = Arrays.copyOf(iArr, i12);
            j.d(iArrCopyOf, "copyOf(...)");
            this.f3806u = iArrCopyOf;
        }
        if (i10 == 1) {
            long[] jArr = this.f3807v;
            if (jArr.length < i12) {
                long[] jArrCopyOf = Arrays.copyOf(jArr, i12);
                j.d(jArrCopyOf, "copyOf(...)");
                this.f3807v = jArrCopyOf;
                return;
            }
            return;
        }
        if (i10 == 2) {
            double[] dArr = this.f3808w;
            if (dArr.length < i12) {
                double[] dArrCopyOf = Arrays.copyOf(dArr, i12);
                j.d(dArrCopyOf, "copyOf(...)");
                this.f3808w = dArrCopyOf;
                return;
            }
            return;
        }
        if (i10 == 3) {
            String[] strArr = this.f3809x;
            if (strArr.length < i12) {
                Object[] objArrCopyOf = Arrays.copyOf(strArr, i12);
                j.d(objArrCopyOf, "copyOf(...)");
                this.f3809x = (String[]) objArrCopyOf;
                return;
            }
            return;
        }
        if (i10 != 4) {
            return;
        }
        byte[][] bArr = this.f3810y;
        if (bArr.length < i12) {
            Object[] objArrCopyOf2 = Arrays.copyOf(bArr, i12);
            j.d(objArrCopyOf2, "copyOf(...)");
            this.f3810y = (byte[][]) objArrCopyOf2;
        }
    }

    @Override // Q2.c
    public final int getColumnCount() {
        b();
        i();
        Cursor cursor = this.f3811z;
        if (cursor != null) {
            return cursor.getColumnCount();
        }
        return 0;
    }

    @Override // Q2.c
    public final String getColumnName(int i10) {
        b();
        i();
        Cursor cursor = this.f3811z;
        if (cursor == null) {
            throw new IllegalStateException("Required value was null.");
        }
        n(cursor, i10);
        String columnName = cursor.getColumnName(i10);
        j.d(columnName, "getColumnName(...)");
        return columnName;
    }

    @Override // Q2.c
    public final long getLong(int i10) {
        b();
        Cursor cursor = this.f3811z;
        if (cursor != null) {
            n(cursor, i10);
            return cursor.getLong(i10);
        }
        u0.F(21, "no row");
        throw null;
    }

    public final void i() {
        if (this.f3811z == null) {
            this.f3811z = this.f3813r.B(new O8.c(this));
        }
    }

    @Override // Q2.c
    public final boolean isNull(int i10) {
        b();
        Cursor cursor = this.f3811z;
        if (cursor != null) {
            n(cursor, i10);
            return cursor.isNull(i10);
        }
        u0.F(21, "no row");
        throw null;
    }

    @Override // Q2.c
    public final String j(int i10) {
        b();
        Cursor cursor = this.f3811z;
        if (cursor == null) {
            u0.F(21, "no row");
            throw null;
        }
        n(cursor, i10);
        String string = cursor.getString(i10);
        j.d(string, "getString(...)");
        return string;
    }

    @Override // Q2.c
    public final void r(String str) {
        j.e(str, "value");
        b();
        e(3, 3);
        this.f3806u[3] = 3;
        this.f3809x[3] = str;
    }

    @Override // Q2.c
    public final void reset() {
        b();
        Cursor cursor = this.f3811z;
        if (cursor != null) {
            cursor.close();
        }
        this.f3811z = null;
    }
}
