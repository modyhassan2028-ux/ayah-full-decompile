package D0;

import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.ArrayList;

/* JADX INFO: renamed from: D0.j, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0092j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f1105a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseLongArray f1106b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f1107c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f1108d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1109e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f1110f = -1;

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:72:0x0157  */
    /* JADX WARN: Code duplicated, block: B:74:0x015a  */
    /* JADX WARN: Code duplicated, block: B:76:0x015d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x015f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x0161  */
    /* JADX WARN: Code duplicated, block: B:79:0x0164  */
    /* JADX WARN: Code duplicated, block: B:80:0x0167  */
    /* JADX WARN: Code duplicated, block: B:81:0x016a  */
    /* JADX WARN: Code duplicated, block: B:82:0x016d  */
    /* JADX WARN: Code duplicated, block: B:85:0x017f  */
    /* JADX WARN: Code duplicated, block: B:90:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:96:0x01fa  */
    public final M.k a(MotionEvent motionEvent, AndroidComposeView androidComposeView) {
        long j;
        int i10;
        int i11;
        long jValueAt;
        float f3;
        long j10;
        long jX;
        long jM;
        int toolType;
        int i12;
        int historySize;
        int i13;
        char c10;
        long jFloatToRawIntBits;
        float historicalX;
        int actionMasked = motionEvent.getActionMasked();
        SparseLongArray sparseLongArray = this.f1106b;
        SparseBooleanArray sparseBooleanArray = this.f1107c;
        int i14 = 3;
        if (actionMasked != 3) {
            int i15 = 4;
            if (actionMasked != 4) {
                if (motionEvent.getPointerCount() == 1) {
                    int toolType2 = motionEvent.getToolType(0);
                    int source = motionEvent.getSource();
                    if (toolType2 != this.f1109e || source != this.f1110f) {
                        this.f1109e = toolType2;
                        this.f1110f = source;
                        sparseBooleanArray.clear();
                        sparseLongArray.clear();
                    }
                }
                int actionMasked2 = motionEvent.getActionMasked();
                if (actionMasked2 == 0 || actionMasked2 == 5) {
                    j = 1;
                    int actionIndex = motionEvent.getActionIndex();
                    int pointerId = motionEvent.getPointerId(actionIndex);
                    if (sparseLongArray.indexOfKey(pointerId) < 0) {
                        long j11 = this.f1105a;
                        this.f1105a = j11 + 1;
                        sparseLongArray.put(pointerId, j11);
                        if (motionEvent.getToolType(actionIndex) == 3) {
                            sparseBooleanArray.put(pointerId, true);
                        }
                    }
                } else if (actionMasked2 != 9) {
                    j = 1;
                } else {
                    int pointerId2 = motionEvent.getPointerId(0);
                    if (sparseLongArray.indexOfKey(pointerId2) < 0) {
                        long j12 = this.f1105a;
                        j = 1;
                        this.f1105a = j12 + 1;
                        sparseLongArray.put(pointerId2, j12);
                    } else {
                        j = 1;
                    }
                }
                boolean z10 = actionMasked == 9 || actionMasked == 7 || actionMasked == 10;
                boolean z11 = actionMasked == 8;
                if (z10) {
                    i10 = 1;
                    sparseBooleanArray.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
                } else {
                    i10 = 1;
                }
                int actionIndex2 = actionMasked != i10 ? actionMasked != 6 ? -1 : motionEvent.getActionIndex() : 0;
                ArrayList arrayList = this.f1108d;
                arrayList.clear();
                int pointerCount = motionEvent.getPointerCount();
                int i16 = 0;
                while (i16 < pointerCount) {
                    boolean z12 = (z10 || i16 == actionIndex2 || (z11 && motionEvent.getButtonState() == 0)) ? false : true;
                    int pointerId3 = motionEvent.getPointerId(i16);
                    int iIndexOfKey = sparseLongArray.indexOfKey(pointerId3);
                    if (iIndexOfKey >= 0) {
                        jValueAt = sparseLongArray.valueAt(iIndexOfKey);
                    } else {
                        long j13 = this.f1105a;
                        this.f1105a = j13 + j;
                        sparseLongArray.put(pointerId3, j13);
                        jValueAt = j13;
                    }
                    float pressure = motionEvent.getPressure(i16);
                    char c11 = ' ';
                    long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(motionEvent.getY(i16))) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getX(i16))) << 32);
                    long jA = p171r0.c.a(jFloatToRawIntBits2, 0.0f, i14);
                    if (i16 == 0) {
                        f3 = 0.0f;
                        jX = (((long) Float.floatToRawIntBits(motionEvent.getRawY())) & 4294967295L) | (((long) Float.floatToRawIntBits(motionEvent.getRawX())) << 32);
                        jM = androidComposeView.M(jX);
                    } else {
                        f3 = 0.0f;
                        if (Build.VERSION.SDK_INT >= 29) {
                            jX = AbstractC0093k.a(motionEvent, i16);
                            jM = androidComposeView.M(jX);
                        } else {
                            j10 = jFloatToRawIntBits2;
                            jX = androidComposeView.x(jFloatToRawIntBits2);
                        }
                        toolType = motionEvent.getToolType(i16);
                        if (toolType == 0) {
                            i12 = 0;
                        } else if (toolType != 1) {
                            i12 = 1;
                        } else if (toolType != 2) {
                            i12 = i14;
                        } else if (toolType != i14) {
                            i12 = 2;
                        } else if (toolType != i15) {
                            i12 = 0;
                        } else {
                            i12 = i15;
                        }
                        ArrayList arrayList2 = new ArrayList(motionEvent.getHistorySize());
                        historySize = motionEvent.getHistorySize();
                        i13 = 0;
                        while (i13 < historySize) {
                            historicalX = motionEvent.getHistoricalX(i16, i13);
                            float historicalY = motionEvent.getHistoricalY(i16, i13);
                            char c12 = c11;
                            if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040 && (Float.floatToRawIntBits(historicalY) & Integer.MAX_VALUE) < 2139095040) {
                                long jFloatToRawIntBits3 = (((long) Float.floatToRawIntBits(historicalX)) << c12) | (((long) Float.floatToRawIntBits(historicalY)) & 4294967295L);
                                arrayList2.add(new C0085c(motionEvent.getHistoricalEventTime(i13), jFloatToRawIntBits3, jFloatToRawIntBits3));
                            }
                            i13++;
                            actionIndex2 = actionIndex2;
                            c11 = c12;
                        }
                        c10 = c11;
                        int i17 = actionIndex2;
                        if (motionEvent.getActionMasked() == 8) {
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c10) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f3)) & 4294967295L);
                        } else {
                            jFloatToRawIntBits = 0;
                        }
                        arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jX, j10, z12, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList2, jFloatToRawIntBits, jA));
                        i16++;
                        actionIndex2 = i17;
                        z11 = z11;
                        z10 = z10;
                        i14 = 3;
                        i15 = 4;
                    }
                    j10 = jM;
                    toolType = motionEvent.getToolType(i16);
                    if (toolType == 0) {
                        i12 = 0;
                    } else if (toolType != 1) {
                        i12 = 1;
                    } else if (toolType != 2) {
                        i12 = i14;
                    } else if (toolType != i14) {
                        i12 = 2;
                    } else if (toolType != i15) {
                        i12 = 0;
                    } else {
                        i12 = i15;
                    }
                    ArrayList arrayList3 = new ArrayList(motionEvent.getHistorySize());
                    historySize = motionEvent.getHistorySize();
                    i13 = 0;
                    while (i13 < historySize) {
                        historicalX = motionEvent.getHistoricalX(i16, i13);
                        float historicalY2 = motionEvent.getHistoricalY(i16, i13);
                        char c13 = c11;
                        if ((Float.floatToRawIntBits(historicalX) & Integer.MAX_VALUE) >= 2139095040) {
                        }
                        i13++;
                        actionIndex2 = actionIndex2;
                        c11 = c13;
                    }
                    c10 = c11;
                    int i18 = actionIndex2;
                    if (motionEvent.getActionMasked() == 8) {
                        jFloatToRawIntBits = (((long) Float.floatToRawIntBits(motionEvent.getAxisValue(10))) << c10) | (((long) Float.floatToRawIntBits((-motionEvent.getAxisValue(9)) + f3)) & 4294967295L);
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    arrayList.add(new x(jValueAt, motionEvent.getEventTime(), jX, j10, z12, pressure, i12, sparseBooleanArray.get(motionEvent.getPointerId(i16), false), arrayList3, jFloatToRawIntBits, jA));
                    i16++;
                    actionIndex2 = i18;
                    z11 = z11;
                    z10 = z10;
                    i14 = 3;
                    i15 = 4;
                }
                int actionMasked3 = motionEvent.getActionMasked();
                if (actionMasked3 == 1 || actionMasked3 == 6) {
                    int pointerId4 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    i11 = 0;
                    if (!sparseBooleanArray.get(pointerId4, false)) {
                        sparseLongArray.delete(pointerId4);
                        sparseBooleanArray.delete(pointerId4);
                    }
                } else {
                    i11 = 0;
                }
                if (sparseLongArray.size() > motionEvent.getPointerCount()) {
                    for (int size = sparseLongArray.size() - 1; -1 < size; size--) {
                        int iKeyAt = sparseLongArray.keyAt(size);
                        int pointerCount2 = motionEvent.getPointerCount();
                        int i19 = i11;
                        while (true) {
                            if (i19 >= pointerCount2) {
                                sparseLongArray.removeAt(size);
                                sparseBooleanArray.delete(iKeyAt);
                                break;
                            }
                            if (motionEvent.getPointerId(i19) == iKeyAt) {
                                break;
                            }
                            i19++;
                        }
                    }
                }
                motionEvent.getEventTime();
                return new M.k(4, arrayList, motionEvent);
            }
        }
        sparseLongArray.clear();
        sparseBooleanArray.clear();
        return null;
    }
}
