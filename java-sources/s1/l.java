package s1;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.ColorDrawable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import io.realm.RealmFieldTypeConstants;
import io.realm.internal.ObjectServerFacade;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f22019d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final SparseIntArray f22020e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f22021a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f22022b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final HashMap f22023c = new HashMap();

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22020e = sparseIntArray;
        sparseIntArray.append(76, 25);
        sparseIntArray.append(77, 26);
        sparseIntArray.append(79, 29);
        sparseIntArray.append(80, 30);
        sparseIntArray.append(86, 36);
        sparseIntArray.append(85, 35);
        sparseIntArray.append(58, 4);
        sparseIntArray.append(57, 3);
        sparseIntArray.append(55, 1);
        sparseIntArray.append(94, 6);
        sparseIntArray.append(95, 7);
        sparseIntArray.append(65, 17);
        sparseIntArray.append(66, 18);
        sparseIntArray.append(67, 19);
        sparseIntArray.append(0, 27);
        sparseIntArray.append(81, 32);
        sparseIntArray.append(82, 33);
        sparseIntArray.append(64, 10);
        sparseIntArray.append(63, 9);
        sparseIntArray.append(98, 13);
        sparseIntArray.append(101, 16);
        sparseIntArray.append(99, 14);
        sparseIntArray.append(96, 11);
        sparseIntArray.append(100, 15);
        sparseIntArray.append(97, 12);
        sparseIntArray.append(89, 40);
        sparseIntArray.append(74, 39);
        sparseIntArray.append(73, 41);
        sparseIntArray.append(88, 42);
        sparseIntArray.append(72, 20);
        sparseIntArray.append(87, 37);
        sparseIntArray.append(62, 5);
        sparseIntArray.append(75, 82);
        sparseIntArray.append(84, 82);
        sparseIntArray.append(78, 82);
        sparseIntArray.append(56, 82);
        sparseIntArray.append(54, 82);
        sparseIntArray.append(5, 24);
        sparseIntArray.append(7, 28);
        sparseIntArray.append(23, 31);
        sparseIntArray.append(24, 8);
        sparseIntArray.append(6, 34);
        sparseIntArray.append(8, 2);
        sparseIntArray.append(3, 23);
        sparseIntArray.append(4, 21);
        sparseIntArray.append(2, 22);
        sparseIntArray.append(13, 43);
        sparseIntArray.append(26, 44);
        sparseIntArray.append(21, 45);
        sparseIntArray.append(22, 46);
        sparseIntArray.append(20, 60);
        sparseIntArray.append(18, 47);
        sparseIntArray.append(19, 48);
        sparseIntArray.append(14, 49);
        sparseIntArray.append(15, 50);
        sparseIntArray.append(16, 51);
        sparseIntArray.append(17, 52);
        sparseIntArray.append(25, 53);
        sparseIntArray.append(90, 54);
        sparseIntArray.append(68, 55);
        sparseIntArray.append(91, 56);
        sparseIntArray.append(69, 57);
        sparseIntArray.append(92, 58);
        sparseIntArray.append(70, 59);
        sparseIntArray.append(59, 61);
        sparseIntArray.append(61, 62);
        sparseIntArray.append(60, 63);
        sparseIntArray.append(27, 64);
        sparseIntArray.append(106, 65);
        sparseIntArray.append(33, 66);
        sparseIntArray.append(107, 67);
        sparseIntArray.append(103, 79);
        sparseIntArray.append(1, 38);
        sparseIntArray.append(102, 68);
        sparseIntArray.append(93, 69);
        sparseIntArray.append(71, 70);
        sparseIntArray.append(31, 71);
        sparseIntArray.append(29, 72);
        sparseIntArray.append(30, 73);
        sparseIntArray.append(32, 74);
        sparseIntArray.append(28, 75);
        sparseIntArray.append(104, 76);
        sparseIntArray.append(83, 77);
        sparseIntArray.append(108, 78);
        sparseIntArray.append(53, 80);
        sparseIntArray.append(52, 81);
    }

    public static int[] e(Barrier barrier, String str) {
        int iIntValue;
        String[] strArrSplit = str.split(",");
        Context context = barrier.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            Object obj = null;
            try {
                iIntValue = o.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && barrier.isInEditMode() && (barrier.getParent() instanceof ConstraintLayout)) {
                ConstraintLayout constraintLayout = (ConstraintLayout) barrier.getParent();
                if (p123m2.c.D(strTrim)) {
                    HashMap map = constraintLayout.f12271D;
                    if (map != null && map.containsKey(strTrim)) {
                        obj = constraintLayout.f12271D.get(strTrim);
                    }
                } else {
                    constraintLayout.getClass();
                }
                if (obj != null && (obj instanceof Integer)) {
                    iIntValue = ((Integer) obj).intValue();
                }
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    public static g f(Context context, AttributeSet attributeSet) {
        g gVar = new g();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p.f22037a);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i10);
            j jVar = gVar.f21934b;
            i iVar = gVar.f21935c;
            k kVar = gVar.f21937e;
            h hVar = gVar.f21936d;
            if (index != 1 && 23 != index && 24 != index) {
                iVar.f21996a = true;
                hVar.f21963b = true;
                jVar.f22002a = true;
                kVar.f22008a = true;
            }
            SparseIntArray sparseIntArray = f22020e;
            switch (sparseIntArray.get(index)) {
                case 1:
                    hVar.f21984p = j(typedArrayObtainStyledAttributes, index, hVar.f21984p);
                    break;
                case 2:
                    hVar.f21946G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21946G);
                    break;
                case 3:
                    hVar.f21983o = j(typedArrayObtainStyledAttributes, index, hVar.f21983o);
                    break;
                case 4:
                    hVar.f21982n = j(typedArrayObtainStyledAttributes, index, hVar.f21982n);
                    break;
                case 5:
                    hVar.f21991w = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 6:
                    hVar.f21940A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.f21940A);
                    break;
                case 7:
                    hVar.f21941B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.f21941B);
                    break;
                case 8:
                    hVar.f21947H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21947H);
                    break;
                case 9:
                    hVar.f21988t = j(typedArrayObtainStyledAttributes, index, hVar.f21988t);
                    break;
                case 10:
                    hVar.f21987s = j(typedArrayObtainStyledAttributes, index, hVar.f21987s);
                    break;
                case 11:
                    hVar.f21952M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21952M);
                    break;
                case 12:
                    hVar.f21953N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21953N);
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LIST /* 13 */:
                    hVar.f21949J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21949J);
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_LINKING_OBJECTS /* 14 */:
                    hVar.f21951L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21951L);
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_OBJECTID /* 15 */:
                    hVar.f21954O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21954O);
                    break;
                case RealmFieldTypeConstants.CORE_TYPE_VALUE_TYPED_LINK /* 16 */:
                    hVar.f21950K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21950K);
                    break;
                case 17:
                    hVar.f21969e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.f21969e);
                    break;
                case 18:
                    hVar.f21971f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, hVar.f21971f);
                    break;
                case ObjectServerFacade.SYNC_CONFIG_OPTIONS /* 19 */:
                    hVar.g = typedArrayObtainStyledAttributes.getFloat(index, hVar.g);
                    break;
                case 20:
                    hVar.f21989u = typedArrayObtainStyledAttributes.getFloat(index, hVar.f21989u);
                    break;
                case 21:
                    hVar.f21967d = typedArrayObtainStyledAttributes.getLayoutDimension(index, hVar.f21967d);
                    break;
                case 22:
                    int i11 = typedArrayObtainStyledAttributes.getInt(index, jVar.f22003b);
                    jVar.f22003b = i11;
                    jVar.f22003b = f22019d[i11];
                    break;
                case 23:
                    hVar.f21965c = typedArrayObtainStyledAttributes.getLayoutDimension(index, hVar.f21965c);
                    break;
                case 24:
                    hVar.f21943D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21943D);
                    break;
                case 25:
                    hVar.f21974h = j(typedArrayObtainStyledAttributes, index, hVar.f21974h);
                    break;
                case 26:
                    hVar.f21976i = j(typedArrayObtainStyledAttributes, index, hVar.f21976i);
                    break;
                case 27:
                    hVar.f21942C = typedArrayObtainStyledAttributes.getInt(index, hVar.f21942C);
                    break;
                case 28:
                    hVar.f21944E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21944E);
                    break;
                case 29:
                    hVar.j = j(typedArrayObtainStyledAttributes, index, hVar.j);
                    break;
                case 30:
                    hVar.f21979k = j(typedArrayObtainStyledAttributes, index, hVar.f21979k);
                    break;
                case 31:
                    hVar.f21948I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21948I);
                    break;
                case 32:
                    hVar.f21985q = j(typedArrayObtainStyledAttributes, index, hVar.f21985q);
                    break;
                case 33:
                    hVar.f21986r = j(typedArrayObtainStyledAttributes, index, hVar.f21986r);
                    break;
                case 34:
                    hVar.f21945F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21945F);
                    break;
                case 35:
                    hVar.f21981m = j(typedArrayObtainStyledAttributes, index, hVar.f21981m);
                    break;
                case 36:
                    hVar.f21980l = j(typedArrayObtainStyledAttributes, index, hVar.f21980l);
                    break;
                case 37:
                    hVar.f21990v = typedArrayObtainStyledAttributes.getFloat(index, hVar.f21990v);
                    break;
                case 38:
                    gVar.f21933a = typedArrayObtainStyledAttributes.getResourceId(index, gVar.f21933a);
                    break;
                case 39:
                    hVar.Q = typedArrayObtainStyledAttributes.getFloat(index, hVar.Q);
                    break;
                case 40:
                    hVar.f21955P = typedArrayObtainStyledAttributes.getFloat(index, hVar.f21955P);
                    break;
                case 41:
                    hVar.R = typedArrayObtainStyledAttributes.getInt(index, hVar.R);
                    break;
                case 42:
                    hVar.S = typedArrayObtainStyledAttributes.getInt(index, hVar.S);
                    break;
                case 43:
                    jVar.f22005d = typedArrayObtainStyledAttributes.getFloat(index, jVar.f22005d);
                    break;
                case 44:
                    kVar.f22017l = true;
                    kVar.f22018m = typedArrayObtainStyledAttributes.getDimension(index, kVar.f22018m);
                    break;
                case 45:
                    kVar.f22010c = typedArrayObtainStyledAttributes.getFloat(index, kVar.f22010c);
                    break;
                case 46:
                    kVar.f22011d = typedArrayObtainStyledAttributes.getFloat(index, kVar.f22011d);
                    break;
                case 47:
                    kVar.f22012e = typedArrayObtainStyledAttributes.getFloat(index, kVar.f22012e);
                    break;
                case 48:
                    kVar.f22013f = typedArrayObtainStyledAttributes.getFloat(index, kVar.f22013f);
                    break;
                case 49:
                    kVar.g = typedArrayObtainStyledAttributes.getDimension(index, kVar.g);
                    break;
                case 50:
                    kVar.f22014h = typedArrayObtainStyledAttributes.getDimension(index, kVar.f22014h);
                    break;
                case 51:
                    kVar.f22015i = typedArrayObtainStyledAttributes.getDimension(index, kVar.f22015i);
                    break;
                case 52:
                    kVar.j = typedArrayObtainStyledAttributes.getDimension(index, kVar.j);
                    break;
                case 53:
                    kVar.f22016k = typedArrayObtainStyledAttributes.getDimension(index, kVar.f22016k);
                    break;
                case 54:
                    hVar.T = typedArrayObtainStyledAttributes.getInt(index, hVar.T);
                    break;
                case 55:
                    hVar.U = typedArrayObtainStyledAttributes.getInt(index, hVar.U);
                    break;
                case 56:
                    hVar.f21956V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21956V);
                    break;
                case 57:
                    hVar.f21957W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21957W);
                    break;
                case 58:
                    hVar.f21958X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21958X);
                    break;
                case 59:
                    hVar.f21959Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21959Y);
                    break;
                case 60:
                    kVar.f22009b = typedArrayObtainStyledAttributes.getFloat(index, kVar.f22009b);
                    break;
                case 61:
                    hVar.f21992x = j(typedArrayObtainStyledAttributes, index, hVar.f21992x);
                    break;
                case 62:
                    hVar.f21993y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21993y);
                    break;
                case 63:
                    hVar.f21994z = typedArrayObtainStyledAttributes.getFloat(index, hVar.f21994z);
                    break;
                case 64:
                    iVar.f21997b = j(typedArrayObtainStyledAttributes, index, iVar.f21997b);
                    break;
                case 65:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        iVar.f21998c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        iVar.f21998c = m1.e.f19501c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    iVar.f22000e = typedArrayObtainStyledAttributes.getInt(index, 0);
                    break;
                case 67:
                    iVar.g = typedArrayObtainStyledAttributes.getFloat(index, iVar.g);
                    break;
                case 68:
                    jVar.f22006e = typedArrayObtainStyledAttributes.getFloat(index, jVar.f22006e);
                    break;
                case 69:
                    hVar.f21960Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 70:
                    hVar.f21962a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    hVar.f21964b0 = typedArrayObtainStyledAttributes.getInt(index, hVar.f21964b0);
                    break;
                case 73:
                    hVar.f21966c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, hVar.f21966c0);
                    break;
                case 74:
                    hVar.f21972f0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 75:
                    hVar.f21978j0 = typedArrayObtainStyledAttributes.getBoolean(index, hVar.f21978j0);
                    break;
                case 76:
                    iVar.f21999d = typedArrayObtainStyledAttributes.getInt(index, iVar.f21999d);
                    break;
                case 77:
                    hVar.f21973g0 = typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 78:
                    jVar.f22004c = typedArrayObtainStyledAttributes.getInt(index, jVar.f22004c);
                    break;
                case 79:
                    iVar.f22001f = typedArrayObtainStyledAttributes.getFloat(index, iVar.f22001f);
                    break;
                case 80:
                    hVar.f21975h0 = typedArrayObtainStyledAttributes.getBoolean(index, hVar.f21975h0);
                    break;
                case 81:
                    hVar.f21977i0 = typedArrayObtainStyledAttributes.getBoolean(index, hVar.f21977i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray.get(index));
                    break;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return gVar;
    }

    public static int j(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    public final void a(MotionLayout motionLayout) {
        int childCount = motionLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = motionLayout.getChildAt(i10);
            int id = childAt.getId();
            Integer numValueOf = Integer.valueOf(id);
            HashMap map = this.f22023c;
            if (!map.containsKey(numValueOf)) {
                Log.v("ConstraintSet", "id unknown " + Y2.a.H(childAt));
            } else {
                if (this.f22022b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (map.containsKey(Integer.valueOf(id))) {
                    a.f(childAt, ((g) map.get(Integer.valueOf(id))).f21938f);
                }
            }
        }
    }

    public final void b(ConstraintLayout constraintLayout) {
        c(constraintLayout);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public final void c(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        HashMap map = this.f22023c;
        HashSet<Integer> hashSet = new HashSet(map.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id = childAt.getId();
            if (!map.containsKey(Integer.valueOf(id))) {
                Log.w("ConstraintSet", "id unknown " + Y2.a.H(childAt));
            } else {
                if (this.f22022b && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (map.containsKey(Integer.valueOf(id))) {
                        hashSet.remove(Integer.valueOf(id));
                        g gVar = (g) map.get(Integer.valueOf(id));
                        if (childAt instanceof Barrier) {
                            gVar.f21936d.f21968d0 = 1;
                        }
                        h hVar = gVar.f21936d;
                        j jVar = gVar.f21934b;
                        k kVar = gVar.f21937e;
                        int i11 = hVar.f21968d0;
                        if (i11 != -1 && i11 == 1) {
                            Barrier barrier = (Barrier) childAt;
                            barrier.setId(id);
                            barrier.setType(hVar.f21964b0);
                            barrier.setMargin(hVar.f21966c0);
                            barrier.setAllowsGoneWidget(hVar.f21978j0);
                            int[] iArr = hVar.f21970e0;
                            if (iArr != null) {
                                barrier.setReferencedIds(iArr);
                            } else {
                                String str = hVar.f21972f0;
                                if (str != null) {
                                    int[] iArrE = e(barrier, str);
                                    hVar.f21970e0 = iArrE;
                                    barrier.setReferencedIds(iArrE);
                                }
                            }
                        }
                        c cVar = (c) childAt.getLayoutParams();
                        cVar.a();
                        gVar.a(cVar);
                        a.f(childAt, gVar.f21938f);
                        childAt.setLayoutParams(cVar);
                        if (jVar.f22004c == 0) {
                            childAt.setVisibility(jVar.f22003b);
                        }
                        childAt.setAlpha(jVar.f22005d);
                        childAt.setRotation(kVar.f22009b);
                        childAt.setRotationX(kVar.f22010c);
                        childAt.setRotationY(kVar.f22011d);
                        childAt.setScaleX(kVar.f22012e);
                        childAt.setScaleY(kVar.f22013f);
                        if (!Float.isNaN(kVar.g)) {
                            childAt.setPivotX(kVar.g);
                        }
                        if (!Float.isNaN(kVar.f22014h)) {
                            childAt.setPivotY(kVar.f22014h);
                        }
                        childAt.setTranslationX(kVar.f22015i);
                        childAt.setTranslationY(kVar.j);
                        childAt.setTranslationZ(kVar.f22016k);
                        if (kVar.f22017l) {
                            childAt.setElevation(kVar.f22018m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            g gVar2 = (g) map.get(num);
            h hVar2 = gVar2.f21936d;
            int i12 = hVar2.f21968d0;
            if (i12 != -1 && i12 == 1) {
                Barrier barrier2 = new Barrier(constraintLayout.getContext());
                barrier2.setId(num.intValue());
                int[] iArr2 = hVar2.f21970e0;
                if (iArr2 != null) {
                    barrier2.setReferencedIds(iArr2);
                } else {
                    String str2 = hVar2.f21972f0;
                    if (str2 != null) {
                        int[] iArrE2 = e(barrier2, str2);
                        hVar2.f21970e0 = iArrE2;
                        barrier2.setReferencedIds(iArrE2);
                    }
                }
                barrier2.setType(hVar2.f21964b0);
                barrier2.setMargin(hVar2.f21966c0);
                int i13 = ConstraintLayout.f12267G;
                c cVar2 = new c();
                barrier2.l();
                gVar2.a(cVar2);
                constraintLayout.addView(barrier2, cVar2);
            }
            if (hVar2.f21961a) {
                View guideline = new Guideline(constraintLayout.getContext());
                guideline.setId(num.intValue());
                int i14 = ConstraintLayout.f12267G;
                c cVar3 = new c();
                gVar2.a(cVar3);
                constraintLayout.addView(guideline, cVar3);
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        l lVar = this;
        int childCount = constraintLayout.getChildCount();
        HashMap map = lVar.f22023c;
        map.clear();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = constraintLayout.getChildAt(i10);
            c cVar = (c) childAt.getLayoutParams();
            int id = childAt.getId();
            if (lVar.f22022b && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!map.containsKey(Integer.valueOf(id))) {
                map.put(Integer.valueOf(id), new g());
            }
            g gVar = (g) map.get(Integer.valueOf(id));
            HashMap map2 = new HashMap();
            Class<?> cls = childAt.getClass();
            HashMap map3 = lVar.f22021a;
            for (String str : map3.keySet()) {
                a aVar = (a) map3.get(str);
                try {
                    if (str.equals("BackgroundColor")) {
                        map2.put(str, new a(aVar, Integer.valueOf(((ColorDrawable) childAt.getBackground()).getColor())));
                    } else {
                        map2.put(str, new a(aVar, cls.getMethod("getMap" + str, null).invoke(childAt, null)));
                    }
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                } catch (NoSuchMethodException e11) {
                    e11.printStackTrace();
                } catch (InvocationTargetException e12) {
                    e12.printStackTrace();
                }
            }
            gVar.f21938f = map2;
            j jVar = gVar.f21934b;
            h hVar = gVar.f21936d;
            k kVar = gVar.f21937e;
            gVar.b(id, cVar);
            jVar.f22003b = childAt.getVisibility();
            jVar.f22005d = childAt.getAlpha();
            kVar.f22009b = childAt.getRotation();
            kVar.f22010c = childAt.getRotationX();
            kVar.f22011d = childAt.getRotationY();
            kVar.f22012e = childAt.getScaleX();
            kVar.f22013f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                kVar.g = pivotX;
                kVar.f22014h = pivotY;
            }
            kVar.f22015i = childAt.getTranslationX();
            kVar.j = childAt.getTranslationY();
            kVar.f22016k = childAt.getTranslationZ();
            if (kVar.f22017l) {
                kVar.f22018m = childAt.getElevation();
            }
            if (childAt instanceof Barrier) {
                Barrier barrier = (Barrier) childAt;
                hVar.f21978j0 = barrier.f12257A.f20823j0;
                hVar.f21970e0 = barrier.getReferencedIds();
                hVar.f21964b0 = barrier.getType();
                hVar.f21966c0 = barrier.getMargin();
            }
            i10++;
            lVar = this;
        }
    }

    public final g g(int i10) {
        Integer numValueOf = Integer.valueOf(i10);
        HashMap map = this.f22023c;
        if (!map.containsKey(numValueOf)) {
            map.put(Integer.valueOf(i10), new g());
        }
        return (g) map.get(Integer.valueOf(i10));
    }

    public final void h(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    g gVarF = f(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        gVarF.f21936d.f21961a = true;
                    }
                    this.f22023c.put(Integer.valueOf(gVarF.f21933a), gVarF);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public final void i(Context context, XmlResourceParser xmlResourceParser) {
        try {
            int eventType = xmlResourceParser.getEventType();
            g gVarF = null;
            while (eventType != 1) {
                if (eventType == 0) {
                    xmlResourceParser.getName();
                } else if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case -2025855158:
                            if (!name.equals("Layout")) {
                                continue;
                            } else {
                                if (gVarF == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                gVarF.f21936d.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1984451626:
                            if (!name.equals("Motion")) {
                                continue;
                            } else {
                                if (gVarF == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                gVarF.f21935c.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1269513683:
                            if (!name.equals("PropertySet")) {
                                continue;
                            } else {
                                if (gVarF == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                gVarF.f21934b.a(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -1238332596:
                            if (!name.equals("Transform")) {
                                continue;
                            } else {
                                if (gVarF == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                gVarF.f21937e.b(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                        case -71750448:
                            if (name.equals("Guideline")) {
                                gVarF = f(context, Xml.asAttributeSet(xmlResourceParser));
                                h hVar = gVarF.f21936d;
                                hVar.f21961a = true;
                                hVar.f21963b = true;
                            }
                            break;
                        case 1331510167:
                            if (name.equals("Barrier")) {
                                gVarF = f(context, Xml.asAttributeSet(xmlResourceParser));
                                gVarF.f21936d.f21968d0 = 1;
                            }
                            break;
                        case 1791837707:
                            if (!name.equals("CustomAttribute")) {
                                continue;
                            } else {
                                if (gVarF == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlResourceParser.getLineNumber());
                                }
                                a.e(context, xmlResourceParser, gVarF.f21938f);
                            }
                            break;
                        case 1803088381:
                            if (name.equals("Constraint")) {
                                gVarF = f(context, Xml.asAttributeSet(xmlResourceParser));
                            }
                            break;
                    }
                } else if (eventType != 3) {
                    continue;
                } else {
                    String name2 = xmlResourceParser.getName();
                    if ("ConstraintSet".equals(name2)) {
                        return;
                    }
                    if (name2.equalsIgnoreCase("Constraint")) {
                        this.f22023c.put(Integer.valueOf(gVarF.f21933a), gVarF);
                        gVarF = null;
                    }
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
