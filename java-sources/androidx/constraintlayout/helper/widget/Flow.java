package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.VirtualLayout;
import java.util.ArrayList;
import java.util.Arrays;
import p153p1.c;
import p153p1.d;
import p153p1.e;
import p153p1.f;
import p153p1.h;
import p153p1.i;
import p153p1.j;
import p163q1.b;
import s1.g;
import s1.m;
import s1.p;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends VirtualLayout {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public h f12143A;

    public Flow(Context context) {
        super(context);
    }

    @Override // androidx.constraintlayout.widget.VirtualLayout, androidx.constraintlayout.widget.ConstraintHelper
    public final void g(AttributeSet attributeSet) {
        super.g(attributeSet);
        this.f12143A = new h();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, p.f22038b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == 0) {
                    this.f12143A.L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    h hVar = this.f12143A;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar.f20950i0 = dimensionPixelSize;
                    hVar.f20951j0 = dimensionPixelSize;
                    hVar.f20952k0 = dimensionPixelSize;
                    hVar.f20953l0 = dimensionPixelSize;
                } else if (index == 11) {
                    h hVar2 = this.f12143A;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    hVar2.f20952k0 = dimensionPixelSize2;
                    hVar2.f20954m0 = dimensionPixelSize2;
                    hVar2.f20955n0 = dimensionPixelSize2;
                } else if (index == 12) {
                    this.f12143A.f20953l0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f12143A.f20954m0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f12143A.f20950i0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f12143A.f20955n0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f12143A.f20951j0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 37) {
                    this.f12143A.f20942J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 27) {
                    this.f12143A.f20961t0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 36) {
                    this.f12143A.f20962u0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 21) {
                    this.f12143A.f20963v0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 29) {
                    this.f12143A.f20965x0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 23) {
                    this.f12143A.f20964w0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 31) {
                    this.f12143A.f20966y0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 25) {
                    this.f12143A.f20967z0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 20) {
                    this.f12143A.f20934B0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 28) {
                    this.f12143A.f20936D0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 22) {
                    this.f12143A.f20935C0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 30) {
                    this.f12143A.f20937E0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 34) {
                    this.f12143A.f20933A0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 24) {
                    this.f12143A.f20940H0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 33) {
                    this.f12143A.f20941I0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 26) {
                    this.f12143A.f20938F0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 35) {
                    this.f12143A.f20939G0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 32) {
                    this.f12143A.f20943K0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
        }
        this.f12263u = this.f12143A;
        l();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void h(g gVar, j jVar, m mVar, SparseArray sparseArray) {
        super.h(gVar, jVar, mVar, sparseArray);
        if (jVar instanceof h) {
            h hVar = (h) jVar;
            int i10 = mVar.R;
            if (i10 != -1) {
                hVar.L0 = i10;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void i(e eVar, boolean z10) {
        h hVar = this.f12143A;
        int i10 = hVar.f20952k0;
        if (i10 > 0 || hVar.f20953l0 > 0) {
            if (z10) {
                hVar.f20954m0 = hVar.f20953l0;
                hVar.f20955n0 = i10;
            } else {
                hVar.f20954m0 = i10;
                hVar.f20955n0 = hVar.f20953l0;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0164  */
    /* JADX WARN: Code duplicated, block: B:101:0x0169  */
    /* JADX WARN: Code duplicated, block: B:103:0x016f  */
    /* JADX WARN: Code duplicated, block: B:105:0x0174  */
    /* JADX WARN: Code duplicated, block: B:107:0x0178  */
    /* JADX WARN: Code duplicated, block: B:111:0x0180  */
    /* JADX WARN: Code duplicated, block: B:114:0x0188  */
    /* JADX WARN: Code duplicated, block: B:117:0x0191  */
    /* JADX WARN: Code duplicated, block: B:120:0x0197  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:130:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:131:0x01be  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f1  */
    /* JADX WARN: Code duplicated, block: B:150:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:152:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:155:0x0208  */
    /* JADX WARN: Code duplicated, block: B:163:0x0222  */
    /* JADX WARN: Code duplicated, block: B:168:0x0236  */
    /* JADX WARN: Code duplicated, block: B:173:0x0254  */
    /* JADX WARN: Code duplicated, block: B:175:0x025a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:176:0x025c  */
    /* JADX WARN: Code duplicated, block: B:181:0x026c  */
    /* JADX WARN: Code duplicated, block: B:183:0x0274 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x0276  */
    /* JADX WARN: Code duplicated, block: B:189:0x028a  */
    /* JADX WARN: Code duplicated, block: B:193:0x0293  */
    /* JADX WARN: Code duplicated, block: B:194:0x0295  */
    /* JADX WARN: Code duplicated, block: B:199:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:201:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:202:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:204:0x0313  */
    /* JADX WARN: Code duplicated, block: B:206:0x0319  */
    /* JADX WARN: Code duplicated, block: B:208:0x0329  */
    /* JADX WARN: Code duplicated, block: B:225:0x034c  */
    /* JADX WARN: Code duplicated, block: B:227:0x036c  */
    /* JADX WARN: Code duplicated, block: B:229:0x0375  */
    /* JADX WARN: Code duplicated, block: B:232:0x038d  */
    /* JADX WARN: Code duplicated, block: B:234:0x0397  */
    /* JADX WARN: Code duplicated, block: B:236:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:253:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:255:0x03de A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:256:0x03e0  */
    /* JADX WARN: Code duplicated, block: B:265:0x0412  */
    /* JADX WARN: Code duplicated, block: B:270:0x041a  */
    /* JADX WARN: Code duplicated, block: B:272:0x0422  */
    /* JADX WARN: Code duplicated, block: B:273:0x042c  */
    /* JADX WARN: Code duplicated, block: B:277:0x044d  */
    /* JADX WARN: Code duplicated, block: B:279:0x0455  */
    /* JADX WARN: Code duplicated, block: B:281:0x0459  */
    /* JADX WARN: Code duplicated, block: B:282:0x046a  */
    /* JADX WARN: Code duplicated, block: B:285:0x048a  */
    /* JADX WARN: Code duplicated, block: B:287:0x0493  */
    /* JADX WARN: Code duplicated, block: B:289:0x0497  */
    /* JADX WARN: Code duplicated, block: B:290:0x04a8  */
    /* JADX WARN: Code duplicated, block: B:293:0x04c8  */
    /* JADX WARN: Code duplicated, block: B:297:0x04df  */
    /* JADX WARN: Code duplicated, block: B:300:0x04f6  */
    /* JADX WARN: Code duplicated, block: B:302:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:303:0x050d  */
    /* JADX WARN: Code duplicated, block: B:306:0x0551 A[LOOP:14: B:305:0x054f->B:306:0x0551, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:310:0x057b A[PHI: r10
      0x057b: PHI (r10v5 int) = (r10v0 int), (r10v2 int), (r10v3 int) binds: [B:309:0x0579, B:314:0x0587, B:312:0x0580] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:311:0x057e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:312:0x0580  */
    /* JADX WARN: Code duplicated, block: B:313:0x0585 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:314:0x0587  */
    /* JADX WARN: Code duplicated, block: B:315:0x0589  */
    /* JADX WARN: Code duplicated, block: B:317:0x058e  */
    /* JADX WARN: Code duplicated, block: B:318:0x0591 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:319:0x0593  */
    /* JADX WARN: Code duplicated, block: B:320:0x059a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:321:0x059c  */
    /* JADX WARN: Code duplicated, block: B:322:0x059e  */
    /* JADX WARN: Code duplicated, block: B:325:0x05ad  */
    /* JADX WARN: Code duplicated, block: B:326:0x05b0  */
    /* JADX WARN: Code duplicated, block: B:336:0x00ef A[EDGE_INSN: B:336:0x00ef->B:65:0x00ef BREAK  A[LOOP:1: B:59:0x00d8->B:64:0x00ea], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:338:0x00ea A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x010c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0162 A[EDGE_INSN: B:342:0x0162->B:99:0x0162 BREAK  A[LOOP:3: B:87:0x0144->B:98:0x015d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:0x0162 A[EDGE_INSN: B:343:0x0162->B:99:0x0162 BREAK  A[LOOP:3: B:87:0x0144->B:98:0x015d], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x0265 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:360:0x027f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:361:0x018e A[EDGE_INSN: B:361:0x018e->B:116:0x018e BREAK  A[LOOP:9: B:104:0x0172->B:115:0x018b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:364:0x018b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:52:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:71:0x0108  */
    /* JADX WARN: Code duplicated, block: B:76:0x011e  */
    /* JADX WARN: Code duplicated, block: B:78:0x0121  */
    /* JADX WARN: Code duplicated, block: B:80:0x0124  */
    /* JADX WARN: Code duplicated, block: B:81:0x0132 A[PHI: r30 r31 r32 r33 r34 r36 r37
      0x0132: PHI (r30v2 int) = (r30v0 int), (r30v3 int), (r30v4 int), (r30v6 int) binds: [B:298:0x04f2, B:296:0x04d5, B:201:0x02d0, B:80:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r31v2 int) = (r31v0 int), (r31v3 int), (r31v4 int), (r31v6 int) binds: [B:298:0x04f2, B:296:0x04d5, B:201:0x02d0, B:80:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r32v2 int) = (r32v0 int), (r32v3 int), (r32v4 int), (r32v6 int) binds: [B:298:0x04f2, B:296:0x04d5, B:201:0x02d0, B:80:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r33v2 int[]) = (r33v0 int[]), (r33v3 int[]), (r33v4 int[]), (r33v6 int[]) binds: [B:298:0x04f2, B:296:0x04d5, B:201:0x02d0, B:80:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r34v2 int) = (r34v0 int), (r34v3 int), (r34v4 int), (r34v6 int) binds: [B:298:0x04f2, B:296:0x04d5, B:201:0x02d0, B:80:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r36v2 int) = (r36v0 int), (r36v4 int), (r36v10 int), (r36v12 int) binds: [B:298:0x04f2, B:296:0x04d5, B:201:0x02d0, B:80:0x0124] A[DONT_GENERATE, DONT_INLINE]
      0x0132: PHI (r37v2 int) = (r37v0 int), (r37v4 int), (r37v10 int), (r37v12 int) binds: [B:298:0x04f2, B:296:0x04d5, B:201:0x02d0, B:80:0x0124] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:82:0x0138  */
    /* JADX WARN: Code duplicated, block: B:84:0x013c  */
    /* JADX WARN: Code duplicated, block: B:86:0x0140  */
    /* JADX WARN: Code duplicated, block: B:89:0x0148 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:90:0x014a  */
    /* JADX WARN: Code duplicated, block: B:94:0x0152  */
    /* JADX WARN: Code duplicated, block: B:97:0x015a  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.constraintlayout.widget.VirtualLayout
    public final void m(h hVar, int i10, int i11) {
        d dVar;
        int i12;
        int i13;
        int i14;
        int i15;
        int[] iArr;
        int i16;
        int i17;
        int i18;
        e[] eVarArr;
        int i19;
        int i20;
        int i21;
        d dVar2;
        e[] eVarArr2;
        int i22;
        int i23;
        int i24;
        int[] iArr2;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        p153p1.g gVar;
        int i31;
        char c10;
        char c11;
        int i32;
        int i33;
        int iMin;
        boolean z10;
        int i34;
        int i35;
        c cVar;
        c cVar2;
        p153p1.g gVar2;
        p153p1.g gVar3;
        int i36;
        int i37;
        int i38;
        int i39;
        e eVar;
        int iE;
        boolean z11;
        int i40;
        int size;
        d[] dVarArr;
        boolean z12;
        c cVar3;
        c cVar4;
        int i41;
        int i42;
        int i43;
        int i44;
        c cVar5;
        c cVar6;
        int i45;
        int iMax;
        int i46;
        p153p1.g gVar4;
        int iD;
        int iC;
        int i47;
        p153p1.g gVar5;
        p153p1.g gVar6;
        int i48;
        int i49;
        e eVar2;
        int iF;
        int i50;
        boolean z13;
        int i51;
        int i52;
        int i53;
        e eVar3;
        int i54;
        int i55;
        int i56;
        int i57;
        int iCeil;
        int iCeil2;
        int i58;
        int i59;
        e eVar4;
        int iE2;
        boolean z14;
        e[] eVarArr3;
        e[] eVarArr4;
        int i60;
        int i61;
        int i62;
        int iF2;
        int i63;
        int iE3;
        e eVar5;
        e eVar6;
        int i64;
        int i65;
        int i66;
        e eVar7;
        int i67;
        e eVar8;
        e eVar9;
        int i68;
        int i69;
        int i70;
        e eVar10;
        int iF3;
        e[] eVarArr5;
        int i71;
        int i72;
        e eVar11;
        e[] eVarArr6;
        int i73;
        d dVar3;
        int mode = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size3 = View.MeasureSpec.getSize(i11);
        int i74 = 0;
        if (hVar == null) {
            setMeasuredDimension(0, 0);
            return;
        }
        ArrayList arrayList = hVar.f20944M0;
        int i75 = hVar.f20974h0;
        d dVar4 = d.f20848t;
        d dVar5 = d.f20847s;
        if (i75 > 0) {
            b bVar = hVar.f20959r0;
            e eVar12 = hVar.f20861K;
            s1.d dVar6 = eVar12 != null ? ((f) eVar12).f20905j0 : null;
            if (dVar6 == null) {
                hVar.f20957p0 = 0;
                hVar.f20958q0 = 0;
                hVar.f20956o0 = false;
            } else {
                int i76 = 0;
                while (i76 < hVar.f20974h0) {
                    e eVar13 = hVar.f20973g0[i76];
                    if (eVar13 == null || (eVar13 instanceof i)) {
                        dVar3 = dVar5;
                    } else {
                        d dVarI = eVar13.i(i74);
                        d dVarI2 = eVar13.i(1);
                        dVar3 = dVar5;
                        if (dVarI != dVar4 || eVar13.j == 1 || dVarI2 != dVar4 || eVar13.f20886k == 1) {
                            if (dVarI == dVar4) {
                                dVarI = dVar3;
                            }
                            if (dVarI2 == dVar4) {
                                dVarI2 = dVar3;
                            }
                            bVar.f21238a = dVarI;
                            bVar.f21239b = dVarI2;
                            bVar.f21240c = eVar13.m();
                            bVar.f21241d = eVar13.j();
                            dVar6.a(eVar13, bVar);
                            eVar13.z(bVar.f21242e);
                            eVar13.w(bVar.f21243f);
                            int i77 = bVar.g;
                            eVar13.R = i77;
                            eVar13.f20898w = i77 > 0;
                        }
                    }
                    i76++;
                    dVar5 = dVar3;
                    i74 = 0;
                }
                dVar = dVar5;
                i12 = hVar.f20954m0;
                i13 = hVar.f20955n0;
                i14 = hVar.f20950i0;
                i15 = hVar.f20951j0;
                iArr = new int[2];
                i16 = (size2 - i12) - i13;
                i17 = hVar.L0;
                if (i17 == 1) {
                    i16 = (size3 - i14) - i15;
                }
                if (i17 == 0) {
                    if (hVar.f20961t0 == -1) {
                        i73 = 0;
                        hVar.f20961t0 = 0;
                    } else {
                        i73 = 0;
                    }
                    i18 = i13;
                    if (hVar.f20962u0 == -1) {
                        hVar.f20962u0 = i73;
                    }
                } else {
                    i18 = i13;
                    if (hVar.f20961t0 == -1) {
                        hVar.f20961t0 = 0;
                    }
                    if (hVar.f20962u0 == -1) {
                        hVar.f20962u0 = 0;
                    }
                }
                eVarArr = hVar.f20973g0;
                i19 = 0;
                i20 = 0;
                while (true) {
                    i21 = hVar.f20974h0;
                    dVar2 = dVar4;
                    if (i19 < i21) {
                        break;
                    }
                    if (hVar.f20973g0[i19].f20869X == 8) {
                        i20++;
                    }
                    i19++;
                    dVar4 = dVar2;
                }
                if (i20 > 0) {
                    eVarArr5 = new e[i21 - i20];
                    i71 = 0;
                    i72 = 0;
                    while (i71 < hVar.f20974h0) {
                        eVar11 = hVar.f20973g0[i71];
                        eVarArr6 = eVarArr5;
                        if (eVar11.f20869X != 8) {
                            eVarArr6[i72] = eVar11;
                            i72++;
                        }
                        i71++;
                        eVarArr5 = eVarArr6;
                    }
                    eVarArr = eVarArr5;
                    i21 = i72;
                }
                eVarArr2 = eVarArr;
                hVar.f20948Q0 = eVarArr2;
                hVar.f20949R0 = i21;
                i22 = hVar.f20942J0;
                if (i22 != 0) {
                    if (i22 != 1) {
                        i34 = i21;
                        i35 = hVar.L0;
                        cVar = hVar.f20852B;
                        cVar2 = hVar.f20851A;
                        if (i34 == 0) {
                            iArr2 = iArr;
                            i25 = mode2;
                            i26 = size3;
                            i27 = i12;
                            i24 = i15;
                            i28 = i18;
                            i23 = i14;
                        } else {
                            arrayList.clear();
                            i27 = i12;
                            i24 = i15;
                            i28 = i18;
                            i23 = i14;
                            iArr2 = iArr;
                            gVar2 = new p153p1.g(hVar, i35, hVar.f20900y, hVar.f20901z, hVar.f20851A, hVar.f20852B, i16);
                            arrayList.add(gVar2);
                            if (i35 == 0) {
                                gVar6 = gVar2;
                                i48 = 0;
                                i39 = 0;
                                i49 = 0;
                                while (i48 < i34) {
                                    eVar2 = eVarArr2[i48];
                                    iF = hVar.F(eVar2, i16);
                                    i50 = i48;
                                    if (eVar2.f20860J[0] == dVar2) {
                                        i39++;
                                    }
                                    int i78 = i39;
                                    z13 = (i49 != i16 || (hVar.f20938F0 + i49) + iF > i16) && gVar6.f20918b != null;
                                    if (!z13 && i50 > 0 && (i54 = hVar.f20943K0) > 0 && i50 % i54 == 0) {
                                        z13 = true;
                                    }
                                    if (z13) {
                                        i51 = mode2;
                                        i52 = size3;
                                        i53 = i50;
                                        eVar3 = eVar2;
                                        p153p1.g gVar7 = new p153p1.g(hVar, i35, hVar.f20900y, hVar.f20901z, hVar.f20851A, hVar.f20852B, i16);
                                        gVar7.f20928n = i53;
                                        arrayList.add(gVar7);
                                        gVar6 = gVar7;
                                    } else {
                                        i51 = mode2;
                                        i52 = size3;
                                        i53 = i50;
                                        eVar3 = eVar2;
                                        if (i53 > 0) {
                                            i49 = hVar.f20938F0 + iF + i49;
                                        }
                                        gVar6.a(eVar3);
                                        i48 = i53 + 1;
                                        i39 = i78;
                                        size3 = i52;
                                        mode2 = i51;
                                    }
                                    i49 = iF;
                                    gVar6.a(eVar3);
                                    i48 = i53 + 1;
                                    i39 = i78;
                                    size3 = i52;
                                    mode2 = i51;
                                }
                                i25 = mode2;
                                i26 = size3;
                            } else {
                                i25 = mode2;
                                i26 = size3;
                                gVar3 = gVar2;
                                i36 = 0;
                                i37 = 0;
                                i38 = 0;
                                while (i38 < i34) {
                                    eVar = eVarArr2[i38];
                                    iE = hVar.E(eVar, i16);
                                    if (eVar.f20860J[1] == dVar2) {
                                        i36++;
                                    }
                                    int i79 = i36;
                                    z11 = (i37 != i16 || (hVar.f20939G0 + i37) + iE > i16) && gVar3.f20918b != null;
                                    if (!z11 && i38 > 0 && (i40 = hVar.f20943K0) > 0 && i38 % i40 == 0) {
                                        z11 = true;
                                    }
                                    if (z11) {
                                        p153p1.g gVar8 = new p153p1.g(hVar, i35, hVar.f20900y, hVar.f20901z, hVar.f20851A, hVar.f20852B, i16);
                                        gVar8.f20928n = i38;
                                        arrayList.add(gVar8);
                                        gVar3 = gVar8;
                                    } else {
                                        if (i38 > 0) {
                                            i37 = hVar.f20939G0 + iE + i37;
                                        }
                                        gVar3.a(eVar);
                                        i38++;
                                        i36 = i79;
                                    }
                                    i37 = iE;
                                    gVar3.a(eVar);
                                    i38++;
                                    i36 = i79;
                                }
                                i39 = i36;
                            }
                            size = arrayList.size();
                            c cVar7 = hVar.f20900y;
                            c cVar8 = hVar.f20901z;
                            int i80 = hVar.f20954m0;
                            int i81 = hVar.f20950i0;
                            int i82 = hVar.f20955n0;
                            int i83 = hVar.f20951j0;
                            dVarArr = hVar.f20860J;
                            if (dVarArr[0] != dVar || dVarArr[1] == dVar) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (i39 > 0 && z12) {
                                for (i47 = 0; i47 < size; i47++) {
                                    gVar5 = (p153p1.g) arrayList.get(i47);
                                    if (i35 == 0) {
                                        gVar5.e(i16 - gVar5.d());
                                    } else {
                                        gVar5.e(i16 - gVar5.c());
                                    }
                                }
                            }
                            cVar3 = cVar7;
                            cVar4 = cVar8;
                            i41 = i80;
                            i42 = i81;
                            i43 = i82;
                            i44 = i83;
                            cVar5 = cVar;
                            cVar6 = cVar2;
                            iMax = 0;
                            i46 = 0;
                            for (i45 = 0; i45 < size; i45++) {
                                gVar4 = (p153p1.g) arrayList.get(i45);
                                if (i35 == 0) {
                                    if (i45 < size - 1) {
                                        cVar5 = ((p153p1.g) arrayList.get(i45 + 1)).f20918b.f20901z;
                                        i44 = 0;
                                    } else {
                                        i44 = hVar.f20951j0;
                                        cVar5 = cVar;
                                    }
                                    c cVar9 = gVar4.f20918b.f20852B;
                                    gVar4.f(i35, cVar3, cVar4, cVar6, cVar5, i41, i42, i43, i44, i16);
                                    iMax = Math.max(iMax, gVar4.d());
                                    iC = gVar4.c() + i46;
                                    if (i45 > 0) {
                                        iC += hVar.f20939G0;
                                    }
                                    i46 = iC;
                                    cVar4 = cVar9;
                                    i42 = 0;
                                } else {
                                    if (i45 < size - 1) {
                                        cVar6 = ((p153p1.g) arrayList.get(i45 + 1)).f20918b.f20900y;
                                        i43 = 0;
                                    } else {
                                        i43 = hVar.f20955n0;
                                        cVar6 = cVar2;
                                    }
                                    c cVar10 = gVar4.f20918b.f20851A;
                                    gVar4.f(i35, cVar3, cVar4, cVar6, cVar5, i41, i42, i43, i44, i16);
                                    iD = gVar4.d() + iMax;
                                    int iMax2 = Math.max(i46, gVar4.c());
                                    if (i45 > 0) {
                                        iD += hVar.f20938F0;
                                    }
                                    i46 = iMax2;
                                    iMax = iD;
                                    cVar3 = cVar10;
                                    i41 = 0;
                                }
                            }
                            iArr2[0] = iMax;
                            iArr2[1] = i46;
                        }
                    } else if (i22 != 2) {
                        i23 = i14;
                        i24 = i15;
                        iArr2 = iArr;
                        i25 = mode2;
                        i26 = size3;
                        i27 = i12;
                        i28 = i18;
                    } else {
                        i55 = hVar.L0;
                        if (i55 == 0) {
                            i68 = hVar.f20943K0;
                            if (i68 <= 0) {
                                i69 = 0;
                                i70 = 0;
                                iCeil2 = 0;
                                while (true) {
                                    i56 = i14;
                                    if (i69 >= i21) {
                                        break;
                                    }
                                    if (i69 > 0) {
                                        i70 += hVar.f20938F0;
                                    }
                                    eVar10 = eVarArr2[i69];
                                    if (eVar10 != null) {
                                        iF3 = hVar.F(eVar10, i16) + i70;
                                        if (iF3 > i16) {
                                            break;
                                        }
                                        iCeil2++;
                                        i70 = iF3;
                                    }
                                    i69++;
                                    i14 = i56;
                                }
                            } else {
                                i56 = i14;
                                iCeil2 = i68;
                            }
                            iCeil = 0;
                        } else {
                            i56 = i14;
                            i57 = hVar.f20943K0;
                            if (i57 <= 0) {
                                i58 = 0;
                                i59 = 0;
                                iCeil = 0;
                                while (i58 < i21) {
                                    int i84 = i58;
                                    if (i58 > 0) {
                                        i59 += hVar.f20939G0;
                                    }
                                    eVar4 = eVarArr2[i84];
                                    if (eVar4 != null) {
                                        iE2 = hVar.E(eVar4, i16) + i59;
                                        if (iE2 > i16) {
                                            break;
                                        }
                                        iCeil++;
                                        i59 = iE2;
                                    }
                                    i58 = i84 + 1;
                                }
                            } else {
                                iCeil = i57;
                            }
                            iCeil2 = 0;
                        }
                        if (hVar.f20947P0 == null) {
                            hVar.f20947P0 = new int[2];
                        }
                        z14 = (iCeil != 0 && i55 == 1) || (iCeil2 == 0 && i55 == 0);
                        while (!z14) {
                            if (i55 == 0) {
                                iCeil = (int) Math.ceil(i21 / iCeil2);
                            } else {
                                iCeil2 = (int) Math.ceil(i21 / iCeil);
                            }
                            eVarArr3 = hVar.f20946O0;
                            if (eVarArr3 != null || eVarArr3.length < iCeil2) {
                                hVar.f20946O0 = new e[iCeil2];
                            } else {
                                Arrays.fill(eVarArr3, (Object) null);
                            }
                            eVarArr4 = hVar.f20945N0;
                            if (eVarArr4 != null || eVarArr4.length < iCeil) {
                                hVar.f20945N0 = new e[iCeil];
                            } else {
                                Arrays.fill(eVarArr4, (Object) null);
                            }
                            i60 = 0;
                            while (i60 < iCeil2) {
                                i64 = 0;
                                while (i64 < iCeil) {
                                    i65 = (i64 * iCeil2) + i60;
                                    int i85 = i21;
                                    if (i55 == 1) {
                                        i65 = (i60 * iCeil) + i64;
                                    }
                                    i66 = i65;
                                    int i86 = i55;
                                    if (i66 >= eVarArr2.length && (eVar7 = eVarArr2[i66]) != null) {
                                        int iF4 = hVar.F(eVar7, i16);
                                        i67 = i60;
                                        eVar8 = hVar.f20946O0[i67];
                                        if (eVar8 != null || eVar8.m() < iF4) {
                                            hVar.f20946O0[i67] = eVar7;
                                        }
                                        int iE4 = hVar.E(eVar7, i16);
                                        eVar9 = hVar.f20945N0[i64];
                                        if (eVar9 != null || eVar9.j() < iE4) {
                                            hVar.f20945N0[i64] = eVar7;
                                        }
                                    } else {
                                        i67 = i60;
                                    }
                                    i64++;
                                    i55 = i86;
                                    i21 = i85;
                                    i60 = i67;
                                }
                                i60++;
                            }
                            int i87 = i21;
                            i61 = i55;
                            iF2 = 0;
                            for (i62 = 0; i62 < iCeil2; i62++) {
                                eVar6 = hVar.f20946O0[i62];
                                if (eVar6 == null) {
                                    if (i62 > 0) {
                                        iF2 += hVar.f20938F0;
                                    }
                                    iF2 = hVar.F(eVar6, i16) + iF2;
                                }
                            }
                            i63 = 0;
                            iE3 = 0;
                            while (i63 < iCeil) {
                                eVar5 = hVar.f20945N0[i63];
                                int i88 = i63;
                                if (eVar5 == null) {
                                    if (i63 > 0) {
                                        iE3 += hVar.f20939G0;
                                    }
                                    iE3 = hVar.E(eVar5, i16) + iE3;
                                }
                                i63 = i88 + 1;
                            }
                            iArr[0] = iF2;
                            iArr[1] = iE3;
                            if (i61 == 0) {
                                if (iF2 > i16 || iCeil2 <= 1) {
                                    z14 = true;
                                } else {
                                    iCeil2--;
                                    z14 = z14;
                                }
                            } else if (iE3 > i16 || iCeil <= 1) {
                                z14 = true;
                            } else {
                                iCeil--;
                                z14 = z14;
                            }
                            i15 = i15;
                            i55 = i61;
                            i21 = i87;
                        }
                        int[] iArr3 = hVar.f20947P0;
                        iArr3[0] = iCeil2;
                        iArr3[1] = iCeil;
                        c11 = 1;
                        iArr2 = iArr;
                        i25 = mode2;
                        i26 = size3;
                        i27 = i12;
                        i24 = i15;
                        i28 = i18;
                        i23 = i56;
                        c10 = 0;
                    }
                    c10 = 0;
                    c11 = 1;
                } else {
                    i23 = i14;
                    i24 = i15;
                    iArr2 = iArr;
                    i25 = mode2;
                    i26 = size3;
                    i27 = i12;
                    i28 = i18;
                    i29 = i21;
                    i30 = hVar.L0;
                    if (i29 == 0) {
                        c10 = 0;
                        c11 = 1;
                    } else {
                        if (arrayList.size() == 0) {
                            gVar = new p153p1.g(hVar, i30, hVar.f20900y, hVar.f20901z, hVar.f20851A, hVar.f20852B, i16);
                            arrayList.add(gVar);
                        } else {
                            p153p1.g gVar9 = (p153p1.g) arrayList.get(0);
                            gVar9.f20919c = 0;
                            gVar9.f20918b = null;
                            gVar9.f20926l = 0;
                            gVar9.f20927m = 0;
                            gVar9.f20928n = 0;
                            gVar9.f20929o = 0;
                            gVar9.f20930p = 0;
                            gVar9.f(i30, hVar.f20900y, hVar.f20901z, hVar.f20851A, hVar.f20852B, hVar.f20954m0, hVar.f20950i0, hVar.f20955n0, hVar.f20951j0, i16);
                            gVar = gVar9;
                        }
                        for (i31 = 0; i31 < i29; i31++) {
                            gVar.a(eVarArr2[i31]);
                        }
                        c10 = 0;
                        iArr2[0] = gVar.d();
                        c11 = 1;
                        iArr2[1] = gVar.c();
                    }
                }
                i32 = iArr2[c10] + i27 + i28;
                i33 = iArr2[c11] + i23 + i24;
                if (mode != 1073741824) {
                    if (mode == Integer.MIN_VALUE) {
                        size2 = Math.min(i32, size2);
                    } else if (mode == 0) {
                        size2 = i32;
                    } else {
                        size2 = 0;
                    }
                }
                if (i25 == 1073741824) {
                    iMin = i26;
                } else if (i25 == -2147483648) {
                    iMin = Math.min(i33, i26);
                } else if (i25 == 0) {
                    iMin = i33;
                } else {
                    iMin = 0;
                }
                hVar.f20957p0 = size2;
                hVar.f20958q0 = iMin;
                hVar.z(size2);
                hVar.w(iMin);
                if (hVar.f20974h0 > 0) {
                    z10 = c11;
                } else {
                    z10 = 0;
                }
                hVar.f20956o0 = z10;
            }
        } else {
            dVar = dVar5;
            i12 = hVar.f20954m0;
            i13 = hVar.f20955n0;
            i14 = hVar.f20950i0;
            i15 = hVar.f20951j0;
            iArr = new int[2];
            i16 = (size2 - i12) - i13;
            i17 = hVar.L0;
            if (i17 == 1) {
                i16 = (size3 - i14) - i15;
            }
            if (i17 == 0) {
                if (hVar.f20961t0 == -1) {
                    i73 = 0;
                    hVar.f20961t0 = 0;
                } else {
                    i73 = 0;
                }
                i18 = i13;
                if (hVar.f20962u0 == -1) {
                    hVar.f20962u0 = i73;
                }
            } else {
                i18 = i13;
                if (hVar.f20961t0 == -1) {
                    hVar.f20961t0 = 0;
                }
                if (hVar.f20962u0 == -1) {
                    hVar.f20962u0 = 0;
                }
            }
            eVarArr = hVar.f20973g0;
            i19 = 0;
            i20 = 0;
            while (true) {
                i21 = hVar.f20974h0;
                dVar2 = dVar4;
                if (i19 < i21) {
                    break;
                    break;
                }
                if (hVar.f20973g0[i19].f20869X == 8) {
                    i20++;
                }
                i19++;
                dVar4 = dVar2;
            }
            if (i20 > 0) {
                eVarArr5 = new e[i21 - i20];
                i71 = 0;
                i72 = 0;
                while (i71 < hVar.f20974h0) {
                    eVar11 = hVar.f20973g0[i71];
                    eVarArr6 = eVarArr5;
                    if (eVar11.f20869X != 8) {
                        eVarArr6[i72] = eVar11;
                        i72++;
                    }
                    i71++;
                    eVarArr5 = eVarArr6;
                }
                eVarArr = eVarArr5;
                i21 = i72;
            }
            eVarArr2 = eVarArr;
            hVar.f20948Q0 = eVarArr2;
            hVar.f20949R0 = i21;
            i22 = hVar.f20942J0;
            if (i22 != 0) {
                if (i22 != 1) {
                    i34 = i21;
                    i35 = hVar.L0;
                    cVar = hVar.f20852B;
                    cVar2 = hVar.f20851A;
                    if (i34 == 0) {
                        iArr2 = iArr;
                        i25 = mode2;
                        i26 = size3;
                        i27 = i12;
                        i24 = i15;
                        i28 = i18;
                        i23 = i14;
                    } else {
                        arrayList.clear();
                        i27 = i12;
                        i24 = i15;
                        i28 = i18;
                        i23 = i14;
                        iArr2 = iArr;
                        gVar2 = new p153p1.g(hVar, i35, hVar.f20900y, hVar.f20901z, hVar.f20851A, hVar.f20852B, i16);
                        arrayList.add(gVar2);
                        if (i35 == 0) {
                            gVar6 = gVar2;
                            i48 = 0;
                            i39 = 0;
                            i49 = 0;
                            while (i48 < i34) {
                                eVar2 = eVarArr2[i48];
                                iF = hVar.F(eVar2, i16);
                                i50 = i48;
                                if (eVar2.f20860J[0] == dVar2) {
                                    i39++;
                                }
                                int i710 = i39;
                                if (i49 != i16) {
                                }
                                if (!z13) {
                                    z13 = true;
                                }
                                if (z13) {
                                    i51 = mode2;
                                    i52 = size3;
                                    i53 = i50;
                                    eVar3 = eVar2;
                                    p153p1.g gVar10 = new p153p1.g(hVar, i35, hVar.f20900y, hVar.f20901z, hVar.f20851A, hVar.f20852B, i16);
                                    gVar10.f20928n = i53;
                                    arrayList.add(gVar10);
                                    gVar6 = gVar10;
                                } else {
                                    i51 = mode2;
                                    i52 = size3;
                                    i53 = i50;
                                    eVar3 = eVar2;
                                    if (i53 > 0) {
                                        i49 = hVar.f20938F0 + iF + i49;
                                    }
                                    gVar6.a(eVar3);
                                    i48 = i53 + 1;
                                    i39 = i710;
                                    size3 = i52;
                                    mode2 = i51;
                                }
                                i49 = iF;
                                gVar6.a(eVar3);
                                i48 = i53 + 1;
                                i39 = i710;
                                size3 = i52;
                                mode2 = i51;
                            }
                            i25 = mode2;
                            i26 = size3;
                        } else {
                            i25 = mode2;
                            i26 = size3;
                            gVar3 = gVar2;
                            i36 = 0;
                            i37 = 0;
                            i38 = 0;
                            while (i38 < i34) {
                                eVar = eVarArr2[i38];
                                iE = hVar.E(eVar, i16);
                                if (eVar.f20860J[1] == dVar2) {
                                    i36++;
                                }
                                int i711 = i36;
                                if (i37 != i16) {
                                }
                                if (!z11) {
                                    z11 = true;
                                }
                                if (z11) {
                                    p153p1.g gVar11 = new p153p1.g(hVar, i35, hVar.f20900y, hVar.f20901z, hVar.f20851A, hVar.f20852B, i16);
                                    gVar11.f20928n = i38;
                                    arrayList.add(gVar11);
                                    gVar3 = gVar11;
                                } else {
                                    if (i38 > 0) {
                                        i37 = hVar.f20939G0 + iE + i37;
                                    }
                                    gVar3.a(eVar);
                                    i38++;
                                    i36 = i711;
                                }
                                i37 = iE;
                                gVar3.a(eVar);
                                i38++;
                                i36 = i711;
                            }
                            i39 = i36;
                        }
                        size = arrayList.size();
                        c cVar11 = hVar.f20900y;
                        c cVar12 = hVar.f20901z;
                        int i89 = hVar.f20954m0;
                        int i810 = hVar.f20950i0;
                        int i811 = hVar.f20955n0;
                        int i812 = hVar.f20951j0;
                        dVarArr = hVar.f20860J;
                        if (dVarArr[0] != dVar) {
                            z12 = true;
                        } else {
                            z12 = true;
                        }
                        if (i39 > 0) {
                            while (i47 < size) {
                                gVar5 = (p153p1.g) arrayList.get(i47);
                                if (i35 == 0) {
                                    gVar5.e(i16 - gVar5.d());
                                } else {
                                    gVar5.e(i16 - gVar5.c());
                                }
                            }
                        }
                        cVar3 = cVar11;
                        cVar4 = cVar12;
                        i41 = i89;
                        i42 = i810;
                        i43 = i811;
                        i44 = i812;
                        cVar5 = cVar;
                        cVar6 = cVar2;
                        iMax = 0;
                        i46 = 0;
                        while (i45 < size) {
                            gVar4 = (p153p1.g) arrayList.get(i45);
                            if (i35 == 0) {
                                if (i45 < size - 1) {
                                    cVar5 = ((p153p1.g) arrayList.get(i45 + 1)).f20918b.f20901z;
                                    i44 = 0;
                                } else {
                                    i44 = hVar.f20951j0;
                                    cVar5 = cVar;
                                }
                                c cVar13 = gVar4.f20918b.f20852B;
                                gVar4.f(i35, cVar3, cVar4, cVar6, cVar5, i41, i42, i43, i44, i16);
                                iMax = Math.max(iMax, gVar4.d());
                                iC = gVar4.c() + i46;
                                if (i45 > 0) {
                                    iC += hVar.f20939G0;
                                }
                                i46 = iC;
                                cVar4 = cVar13;
                                i42 = 0;
                            } else {
                                if (i45 < size - 1) {
                                    cVar6 = ((p153p1.g) arrayList.get(i45 + 1)).f20918b.f20900y;
                                    i43 = 0;
                                } else {
                                    i43 = hVar.f20955n0;
                                    cVar6 = cVar2;
                                }
                                c cVar14 = gVar4.f20918b.f20851A;
                                gVar4.f(i35, cVar3, cVar4, cVar6, cVar5, i41, i42, i43, i44, i16);
                                iD = gVar4.d() + iMax;
                                int iMax3 = Math.max(i46, gVar4.c());
                                if (i45 > 0) {
                                    iD += hVar.f20938F0;
                                }
                                i46 = iMax3;
                                iMax = iD;
                                cVar3 = cVar14;
                                i41 = 0;
                            }
                        }
                        iArr2[0] = iMax;
                        iArr2[1] = i46;
                    }
                } else if (i22 != 2) {
                    i23 = i14;
                    i24 = i15;
                    iArr2 = iArr;
                    i25 = mode2;
                    i26 = size3;
                    i27 = i12;
                    i28 = i18;
                } else {
                    i55 = hVar.L0;
                    if (i55 == 0) {
                        i68 = hVar.f20943K0;
                        if (i68 <= 0) {
                            i69 = 0;
                            i70 = 0;
                            iCeil2 = 0;
                            while (true) {
                                i56 = i14;
                                if (i69 >= i21) {
                                    break;
                                    break;
                                }
                                if (i69 > 0) {
                                    i70 += hVar.f20938F0;
                                }
                                eVar10 = eVarArr2[i69];
                                if (eVar10 != null) {
                                    iF3 = hVar.F(eVar10, i16) + i70;
                                    if (iF3 > i16) {
                                        break;
                                        break;
                                    } else {
                                        iCeil2++;
                                        i70 = iF3;
                                    }
                                }
                                i69++;
                                i14 = i56;
                            }
                        } else {
                            i56 = i14;
                            iCeil2 = i68;
                        }
                        iCeil = 0;
                    } else {
                        i56 = i14;
                        i57 = hVar.f20943K0;
                        if (i57 <= 0) {
                            i58 = 0;
                            i59 = 0;
                            iCeil = 0;
                            while (i58 < i21) {
                                int i813 = i58;
                                if (i58 > 0) {
                                    i59 += hVar.f20939G0;
                                }
                                eVar4 = eVarArr2[i813];
                                if (eVar4 != null) {
                                    iE2 = hVar.E(eVar4, i16) + i59;
                                    if (iE2 > i16) {
                                        break;
                                        break;
                                    } else {
                                        iCeil++;
                                        i59 = iE2;
                                    }
                                }
                                i58 = i813 + 1;
                            }
                        } else {
                            iCeil = i57;
                        }
                        iCeil2 = 0;
                    }
                    if (hVar.f20947P0 == null) {
                        hVar.f20947P0 = new int[2];
                    }
                    if (iCeil != 0) {
                    }
                    while (!z14) {
                        if (i55 == 0) {
                            iCeil = (int) Math.ceil(i21 / iCeil2);
                        } else {
                            iCeil2 = (int) Math.ceil(i21 / iCeil);
                        }
                        eVarArr3 = hVar.f20946O0;
                        if (eVarArr3 != null) {
                            hVar.f20946O0 = new e[iCeil2];
                        } else {
                            hVar.f20946O0 = new e[iCeil2];
                        }
                        eVarArr4 = hVar.f20945N0;
                        if (eVarArr4 != null) {
                            hVar.f20945N0 = new e[iCeil];
                        } else {
                            hVar.f20945N0 = new e[iCeil];
                        }
                        i60 = 0;
                        while (i60 < iCeil2) {
                            i64 = 0;
                            while (i64 < iCeil) {
                                i65 = (i64 * iCeil2) + i60;
                                int i814 = i21;
                                if (i55 == 1) {
                                    i65 = (i60 * iCeil) + i64;
                                }
                                i66 = i65;
                                int i815 = i55;
                                if (i66 >= eVarArr2.length) {
                                    i67 = i60;
                                } else {
                                    int iF5 = hVar.F(eVar7, i16);
                                    i67 = i60;
                                    eVar8 = hVar.f20946O0[i67];
                                    if (eVar8 != null) {
                                        hVar.f20946O0[i67] = eVar7;
                                    } else {
                                        hVar.f20946O0[i67] = eVar7;
                                    }
                                    int iE5 = hVar.E(eVar7, i16);
                                    eVar9 = hVar.f20945N0[i64];
                                    if (eVar9 != null) {
                                        hVar.f20945N0[i64] = eVar7;
                                    } else {
                                        hVar.f20945N0[i64] = eVar7;
                                    }
                                }
                                i64++;
                                i55 = i815;
                                i21 = i814;
                                i60 = i67;
                            }
                            i60++;
                        }
                        int i816 = i21;
                        i61 = i55;
                        iF2 = 0;
                        while (i62 < iCeil2) {
                            eVar6 = hVar.f20946O0[i62];
                            if (eVar6 == null) {
                                if (i62 > 0) {
                                    iF2 += hVar.f20938F0;
                                }
                                iF2 = hVar.F(eVar6, i16) + iF2;
                            }
                        }
                        i63 = 0;
                        iE3 = 0;
                        while (i63 < iCeil) {
                            eVar5 = hVar.f20945N0[i63];
                            int i817 = i63;
                            if (eVar5 == null) {
                                if (i63 > 0) {
                                    iE3 += hVar.f20939G0;
                                }
                                iE3 = hVar.E(eVar5, i16) + iE3;
                            }
                            i63 = i817 + 1;
                        }
                        iArr[0] = iF2;
                        iArr[1] = iE3;
                        if (i61 == 0) {
                            if (iF2 > i16) {
                            }
                            z14 = true;
                        } else {
                            if (iE3 > i16) {
                            }
                            z14 = true;
                        }
                        i15 = i15;
                        i55 = i61;
                        i21 = i816;
                    }
                    int[] iArr4 = hVar.f20947P0;
                    iArr4[0] = iCeil2;
                    iArr4[1] = iCeil;
                    c11 = 1;
                    iArr2 = iArr;
                    i25 = mode2;
                    i26 = size3;
                    i27 = i12;
                    i24 = i15;
                    i28 = i18;
                    i23 = i56;
                    c10 = 0;
                }
                c10 = 0;
                c11 = 1;
            } else {
                i23 = i14;
                i24 = i15;
                iArr2 = iArr;
                i25 = mode2;
                i26 = size3;
                i27 = i12;
                i28 = i18;
                i29 = i21;
                i30 = hVar.L0;
                if (i29 == 0) {
                    c10 = 0;
                    c11 = 1;
                } else {
                    if (arrayList.size() == 0) {
                        gVar = new p153p1.g(hVar, i30, hVar.f20900y, hVar.f20901z, hVar.f20851A, hVar.f20852B, i16);
                        arrayList.add(gVar);
                    } else {
                        p153p1.g gVar12 = (p153p1.g) arrayList.get(0);
                        gVar12.f20919c = 0;
                        gVar12.f20918b = null;
                        gVar12.f20926l = 0;
                        gVar12.f20927m = 0;
                        gVar12.f20928n = 0;
                        gVar12.f20929o = 0;
                        gVar12.f20930p = 0;
                        gVar12.f(i30, hVar.f20900y, hVar.f20901z, hVar.f20851A, hVar.f20852B, hVar.f20954m0, hVar.f20950i0, hVar.f20955n0, hVar.f20951j0, i16);
                        gVar = gVar12;
                    }
                    while (i31 < i29) {
                        gVar.a(eVarArr2[i31]);
                    }
                    c10 = 0;
                    iArr2[0] = gVar.d();
                    c11 = 1;
                    iArr2[1] = gVar.c();
                }
            }
            i32 = iArr2[c10] + i27 + i28;
            i33 = iArr2[c11] + i23 + i24;
            if (mode != 1073741824) {
                if (mode == Integer.MIN_VALUE) {
                    size2 = Math.min(i32, size2);
                } else if (mode == 0) {
                    size2 = i32;
                } else {
                    size2 = 0;
                }
            }
            if (i25 == 1073741824) {
                iMin = i26;
            } else if (i25 == -2147483648) {
                iMin = Math.min(i33, i26);
            } else if (i25 == 0) {
                iMin = i33;
            } else {
                iMin = 0;
            }
            hVar.f20957p0 = size2;
            hVar.f20958q0 = iMin;
            hVar.z(size2);
            hVar.w(iMin);
            if (hVar.f20974h0 > 0) {
                z10 = c11;
            } else {
                z10 = 0;
            }
            hVar.f20956o0 = z10;
        }
        setMeasuredDimension(hVar.f20957p0, hVar.f20958q0);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onMeasure(int i10, int i11) {
        m(this.f12143A, i10, i11);
    }

    public void setFirstHorizontalBias(float f3) {
        this.f12143A.f20934B0 = f3;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i10) {
        this.f12143A.f20963v0 = i10;
        requestLayout();
    }

    public void setFirstVerticalBias(float f3) {
        this.f12143A.f20935C0 = f3;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i10) {
        this.f12143A.f20964w0 = i10;
        requestLayout();
    }

    public void setHorizontalAlign(int i10) {
        this.f12143A.f20940H0 = i10;
        requestLayout();
    }

    public void setHorizontalBias(float f3) {
        this.f12143A.f20967z0 = f3;
        requestLayout();
    }

    public void setHorizontalGap(int i10) {
        this.f12143A.f20938F0 = i10;
        requestLayout();
    }

    public void setHorizontalStyle(int i10) {
        this.f12143A.f20961t0 = i10;
        requestLayout();
    }

    public void setMaxElementsWrap(int i10) {
        this.f12143A.f20943K0 = i10;
        requestLayout();
    }

    public void setOrientation(int i10) {
        this.f12143A.L0 = i10;
        requestLayout();
    }

    public void setPadding(int i10) {
        h hVar = this.f12143A;
        hVar.f20950i0 = i10;
        hVar.f20951j0 = i10;
        hVar.f20952k0 = i10;
        hVar.f20953l0 = i10;
        requestLayout();
    }

    public void setPaddingBottom(int i10) {
        this.f12143A.f20951j0 = i10;
        requestLayout();
    }

    public void setPaddingLeft(int i10) {
        this.f12143A.f20954m0 = i10;
        requestLayout();
    }

    public void setPaddingRight(int i10) {
        this.f12143A.f20955n0 = i10;
        requestLayout();
    }

    public void setPaddingTop(int i10) {
        this.f12143A.f20950i0 = i10;
        requestLayout();
    }

    public void setVerticalAlign(int i10) {
        this.f12143A.f20941I0 = i10;
        requestLayout();
    }

    public void setVerticalBias(float f3) {
        this.f12143A.f20933A0 = f3;
        requestLayout();
    }

    public void setVerticalGap(int i10) {
        this.f12143A.f20939G0 = i10;
        requestLayout();
    }

    public void setVerticalStyle(int i10) {
        this.f12143A.f20962u0 = i10;
        requestLayout();
    }

    public void setWrapMode(int i10) {
        this.f12143A.f20942J0 = i10;
        requestLayout();
    }

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Flow(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
    }
}
