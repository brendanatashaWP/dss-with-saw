<template>
    <div class="row">
      <div>
        <div class="card">
          <div class="header">
            <h4 class="title">Kandidat 1</h4>
          </div>
          <div class="content">
            <form>
              <div class="row">
                <div class="col-md-8">
                  <label for="namaKandidat">Nama kandidat:</label>
                  <input type="text" v-model="namaKandidat1" style="width:50%">
                </div><br>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">RAM </label><br>
                  <select v-model="ramSelected1">
                    <option disabled value=''>Please select one</option>
                    <option>8 GB</option><option>6 GB</option><option>4 GB</option>
                    <option>3 GB</option><option>2 GB</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Processor</label><br>
                  <select v-model="processorSelected1">
                    <option disabled value=''>Please select one</option>
                    <option>Snapdragon</option>
                    <option>Mediatek</option>
                    <option>Intel</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Battery</label><br>
                  <select v-model="batterySelected1">
                    <option disabled value=''>Please select one</option>
                    <option>5001 - 6000</option>
                    <option>4001 - 5000</option>
                    <option>3001 - 4000</option>
                    <option>2000 - 3000</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Price</label><br>
                  <select v-model="priceSelected1">
                    <option disabled value=''>Please select one</option>
                    <option>6jt - 7jt</option>
                    <option>4jt - 5jt</option>
                    <option>3jt - 4jt</option>
                    <option>2jt - 3jt</option>
                    <option>1jt - 2jt</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Internal Memory</label><br>
                  <select v-model="memorySelected1">
                    <option disabled value=''>Please select one</option>
                    <option>128 Gb</option>
                    <option>64 Gb</option>
                    <option>32 Gb</option>
                    <option>16 Gb</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Screen</label><br>
                  <select v-model="screenSelected1">
                    <option disabled value=''>Please select one</option>
                    <option>6,1 - 6,5</option>
                    <option>5,6 - 6</option>
                    <option>5,1 - 5,5</option>
                    <option>4,5 - 5</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Brand</label><br>
                  <select v-model="brandSelected1">
                    <option disabled value=''>Please select one</option>
                    <option>Samsung</option>
                    <option>Oppo</option>
                    <option>Vivo</option>
                    <option>Xiaomi</option>
                    <option>LG</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Rear Camera</label><br>
                  <select v-model="rearCameraSelected1">
                    <option disabled value=''>Please select one</option>
                    <option>16</option>
                    <option>13</option>
                    <option>12</option>
                    <option>8</option>
                    <option>5</option>
                  </select>
                </div>
                <div class="text-right">
                  <button type="submit" @click="isiKandidat(1)" class="btn btn-success btn-fill" style="margin-right:20%; margin-top:2%; font-size: 10px;">Submit Kandidat 1</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
      <div>
        <div class="card">
          <div class="header">
            <h4 class="title">Kandidat 2</h4>
          </div>
          <div class="content">
            <form>
              <div class="row">
                <div class="col-md-8">
                  <label for="namaKandidat">Nama kandidat:</label>
                  <input type="text" v-model="namaKandidat2" style="width:50%">
                </div><br>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">RAM </label><br>
                  <select v-model="ramSelected2">
                    <option disabled value=''>Please select one</option>
                    <option>8 GB</option><option>6 GB</option><option>4 GB</option>
                    <option>3 GB</option><option>2 GB</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Processor</label><br>
                  <select v-model="processorSelected2">
                    <option disabled value=''>Please select one</option>
                    <option>Snapdragon</option>
                    <option>Mediatek</option>
                    <option>Intel</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Battery</label><br>
                  <select v-model="batterySelected2">
                    <option disabled value=''>Please select one</option>
                    <option>5001 - 6000</option>
                    <option>4001 - 5000</option>
                    <option>3001 - 4000</option>
                    <option>2000 - 3000</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Price</label><br>
                  <select v-model="priceSelected2">
                    <option disabled value=''>Please select one</option>
                    <option>6jt - 7jt</option>
                    <option>4jt - 5jt</option>
                    <option>3jt - 4jt</option>
                    <option>2jt - 3jt</option>
                    <option>1jt - 2jt</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Internal Memory</label><br>
                  <select v-model="memorySelected2">
                    <option disabled value=''>Please select one</option>
                    <option>128 Gb</option>
                    <option>64 Gb</option>
                    <option>32 Gb</option>
                    <option>16 Gb</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Screen</label><br>
                  <select v-model="screenSelected2">
                    <option disabled value=''>Please select one</option>
                    <option>6,1 - 6,5</option>
                    <option>5,6 - 6</option>
                    <option>5,1 - 5,5</option>
                    <option>4,5 - 5</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Brand</label><br>
                  <select v-model="brandSelected2">
                    <option disabled value=''>Please select one</option>
                    <option>Samsung</option>
                    <option>Oppo</option>
                    <option>Vivo</option>
                    <option>Xiaomi</option>
                    <option>LG</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Rear Camera</label><br>
                  <select v-model="rearCameraSelected2">
                    <option disabled value=''>Please select one</option>
                    <option>16</option>
                    <option>13</option>
                    <option>12</option>
                    <option>8</option>
                    <option>5</option>
                  </select>
                </div>
                <div class="text-right">
                  <button type="submit" @click="isiKandidat(2)" class="btn btn-success btn-fill" style="margin-right:20%; margin-top:2%; font-size: 10px;">Submit Kandidat 2</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
      <div>
        <div class="card">
          <div class="header">
            <h4 class="title">Kandidat 3</h4>
          </div>
          <div class="content">
            <form>
              <div class="row">
                <div class="col-md-8">
                  <label for="namaKandidat">Nama kandidat:</label>
                  <input type="text" v-model="namaKandidat3" style="width:50%">
                </div><br>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">RAM </label><br>
                  <select v-model="ramSelected3">
                    <option disabled value=''>Please select one</option>
                    <option>8 GB</option><option>6 GB</option><option>4 GB</option>
                    <option>3 GB</option><option>2 GB</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Processor</label><br>
                  <select v-model="processorSelected3">
                    <option disabled value=''>Please select one</option>
                    <option>Snapdragon</option>
                    <option>Mediatek</option>
                    <option>Intel</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Battery</label><br>
                  <select v-model="batterySelected3">
                    <option disabled value=''>Please select one</option>
                    <option>5001 - 6000</option>
                    <option>4001 - 5000</option>
                    <option>3001 - 4000</option>
                    <option>2000 - 3000</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Price</label><br>
                  <select v-model="priceSelected3">
                    <option disabled value=''>Please select one</option>
                    <option>6jt - 7jt</option>
                    <option>4jt - 5jt</option>
                    <option>3jt - 4jt</option>
                    <option>2jt - 3jt</option>
                    <option>1jt - 2jt</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Internal Memory</label><br>
                  <select v-model="memorySelected3">
                    <option disabled value=''>Please select one</option>
                    <option>128 Gb</option>
                    <option>64 Gb</option>
                    <option>32 Gb</option>
                    <option>16 Gb</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Screen</label><br>
                  <select v-model="screenSelected3">
                    <option disabled value=''>Please select one</option>
                    <option>6,1 - 6,5</option>
                    <option>5,6 - 6</option>
                    <option>5,1 - 5,5</option>
                    <option>4,5 - 5</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Brand</label><br>
                  <select v-model="brandSelected3">
                    <option disabled value=''>Please select one</option>
                    <option>Samsung</option>
                    <option>Oppo</option>
                    <option>Vivo</option>
                    <option>Xiaomi</option>
                    <option>LG</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Rear Camera</label><br>
                  <select v-model="rearCameraSelected3">
                    <option disabled value=''>Please select one</option>
                    <option>16</option>
                    <option>13</option>
                    <option>12</option>
                    <option>8</option>
                    <option>5</option>
                  </select>
                </div>
                <div class="text-right">
                  <button type="submit" @click="isiKandidat(3)" class="btn btn-success btn-fill" style="margin-right:20%; margin-top:2%; font-size: 10px;">Submit Kandidat 3</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
      <div>
        <div class="card">
          <div class="header">
            <h4 class="title">Kandidat 4</h4>
          </div>
          <div class="content">
            <form>
              <div class="row">
                <div class="col-md-8">
                  <label for="namaKandidat">Nama kandidat:</label>
                  <input type="text" v-model="namaKandidat4" style="width:50%">
                </div><br>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">RAM </label><br>
                  <select v-model="ramSelected4">
                    <option disabled value=''>Please select one</option>
                    <option>8 GB</option><option>6 GB</option><option>4 GB</option>
                    <option>3 GB</option><option>2 GB</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Processor</label><br>
                  <select v-model="processorSelected4">
                    <option disabled value=''>Please select one</option>
                    <option>Snapdragon</option>
                    <option>Mediatek</option>
                    <option>Intel</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Battery</label><br>
                  <select v-model="batterySelected4">
                    <option disabled value=''>Please select one</option>
                    <option>5001 - 6000</option>
                    <option>4001 - 5000</option>
                    <option>3001 - 4000</option>
                    <option>2000 - 3000</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Price</label><br>
                  <select v-model="priceSelected4">
                    <option disabled value=''>Please select one</option>
                    <option>6jt - 7jt</option>
                    <option>4jt - 5jt</option>
                    <option>3jt - 4jt</option>
                    <option>2jt - 3jt</option>
                    <option>1jt - 2jt</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Internal Memory</label><br>
                  <select v-model="memorySelected4">
                    <option disabled value=''>Please select one</option>
                    <option>128 Gb</option>
                    <option>64 Gb</option>
                    <option>32 Gb</option>
                    <option>16 Gb</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Screen</label><br>
                  <select v-model="screenSelected4">
                    <option disabled value=''>Please select one</option>
                    <option>6,1 - 6,5</option>
                    <option>5,6 - 6</option>
                    <option>5,1 - 5,5</option>
                    <option>4,5 - 5</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Brand</label><br>
                  <select v-model="brandSelected4">
                    <option disabled value=''>Please select one</option>
                    <option>Samsung</option>
                    <option>Oppo</option>
                    <option>Vivo</option>
                    <option>Xiaomi</option>
                    <option>LG</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Rear Camera</label><br>
                  <select v-model="rearCameraSelected4">
                    <option disabled value=''>Please select one</option>
                    <option>16</option>
                    <option>13</option>
                    <option>12</option>
                    <option>8</option>
                    <option>5</option>
                  </select>
                </div>
                <div class="text-right">
                  <button type="submit" @click="isiKandidat(4)" class="btn btn-success btn-fill" style="margin-right:20%; margin-top:2%; font-size: 10px;">Submit Kandidat 4</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
      <div>
        <div class="card">
          <div class="header">
            <h4 class="title">Kandidat 5</h4>
          </div>
          <div class="content">
            <form>
              <div class="row">
                <div class="col-md-8">
                  <label for="namaKandidat">Nama kandidat:</label>
                  <input type="text" v-model="namaKandidat5" style="width:50%">
                </div><br>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">RAM </label><br>
                  <select v-model="ramSelected5">
                    <option disabled value=''>Please select one</option>
                    <option>8 GB</option><option>6 GB</option><option>4 GB</option>
                    <option>3 GB</option><option>2 GB</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Processor</label><br>
                  <select v-model="processorSelected5">
                    <option disabled value=''>Please select one</option>
                    <option>Snapdragon</option>
                    <option>Mediatek</option>
                    <option>Intel</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Battery</label><br>
                  <select v-model="batterySelected5">
                    <option disabled value=''>Please select one</option>
                    <option>5001 - 6000</option>
                    <option>4001 - 5000</option>
                    <option>3001 - 4000</option>
                    <option>2000 - 3000</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Price</label><br>
                  <select v-model="priceSelected5">
                    <option disabled value=''>Please select one</option>
                    <option>6jt - 7jt</option>
                    <option>4jt - 5jt</option>
                    <option>3jt - 4jt</option>
                    <option>2jt - 3jt</option>
                    <option>1jt - 2jt</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Internal Memory</label><br>
                  <select v-model="memorySelected5">
                    <option disabled value=''>Please select one</option>
                    <option>128 Gb</option>
                    <option>64 Gb</option>
                    <option>32 Gb</option>
                    <option>16 Gb</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Screen</label><br>
                  <select v-model="screenSelected5">
                    <option disabled value=''>Please select one</option>
                    <option>6,1 - 6,5</option>
                    <option>5,6 - 6</option>
                    <option>5,1 - 5,5</option>
                    <option>4,5 - 5</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Brand</label><br>
                  <select v-model="brandSelected5">
                    <option disabled value=''>Please select one</option>
                    <option>Samsung</option>
                    <option>Oppo</option>
                    <option>Vivo</option>
                    <option>Xiaomi</option>
                    <option>LG</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Rear Camera</label><br>
                  <select v-model="rearCameraSelected5">
                    <option disabled value=''>Please select one</option>
                    <option>16</option>
                    <option>13</option>
                    <option>12</option>
                    <option>8</option>
                    <option>5</option>
                  </select>
                </div>
                <div class="text-right">
                  <button type="submit" @click="isiKandidat(5)" class="btn btn-success btn-fill" style="margin-right:20%; margin-top:2%; font-size: 10px;">Submit Kandidat 5</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
      <div>
        <div class="card">
          <div class="header">
            <h4 class="title">Kandidat 6</h4>
          </div>
          <div class="content">
            <form>
              <div class="row">
                <div class="col-md-8">
                  <label for="namaKandidat">Nama kandidat:</label>
                  <input type="text" v-model="namaKandidat6" style="width:50%">
                </div><br>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">RAM </label><br>
                  <select v-model="ramSelected6">
                    <option disabled value=''>Please select one</option>
                    <option>8 GB</option><option>6 GB</option><option>4 GB</option>
                    <option>3 GB</option><option>2 GB</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Processor</label><br>
                  <select v-model="processorSelected6">
                    <option disabled value=''>Please select one</option>
                    <option>Snapdragon</option>
                    <option>Mediatek</option>
                    <option>Intel</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Battery</label><br>
                  <select v-model="batterySelected6">
                    <option disabled value=''>Please select one</option>
                    <option>5001 - 6000</option>
                    <option>4001 - 5000</option>
                    <option>3001 - 4000</option>
                    <option>2000 - 3000</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Price</label><br>
                  <select v-model="priceSelected6">
                    <option disabled value=''>Please select one</option>
                    <option>6jt - 7jt</option>
                    <option>4jt - 5jt</option>
                    <option>3jt - 4jt</option>
                    <option>2jt - 3jt</option>
                    <option>1jt - 2jt</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Internal Memory</label><br>
                  <select v-model="memorySelected6">
                    <option disabled value=''>Please select one</option>
                    <option>128 Gb</option>
                    <option>64 Gb</option>
                    <option>32 Gb</option>
                    <option>16 Gb</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Screen</label><br>
                  <select v-model="screenSelected6">
                    <option disabled value=''>Please select one</option>
                    <option>6,1 - 6,5</option>
                    <option>5,6 - 6</option>
                    <option>5,1 - 5,5</option>
                    <option>4,5 - 5</option>
                  </select>
                </div>
              </div>
              <div class="row">
                <div class="col-md-4">
                  <label for="ram">Brand</label><br>
                  <select v-model="brandSelected6">
                    <option disabled value=''>Please select one</option>
                    <option>Samsung</option>
                    <option>Oppo</option>
                    <option>Vivo</option>
                    <option>Xiaomi</option>
                    <option>LG</option>
                  </select>
                </div>
              <!-- </div>
              <div class="row"> -->
                <div class="col-md-4">
                  <label for="ram">Rear Camera</label><br>
                  <select v-model="rearCameraSelected6">
                    <option disabled value=''>Please select one</option>
                    <option>16</option>
                    <option>13</option>
                    <option>12</option>
                    <option>8</option>
                    <option>5</option>
                  </select>
                </div>
                <div class="text-right">
                  <button type="submit" @click="isiKandidat(6)" class="btn btn-success btn-fill" style="margin-right:20%; margin-top:2%; font-size: 10px;">Submit Kandidat 6</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
      <button type="submit" class="btn btn-info btn-fill" style="float:left"><a href="/#/admin/input-bobot" style="color:white" class="ti-arrow-left"> Back</a></button>
      <button type="submit" class="btn btn-info btn-fill" @click="isiKandidat" style="float:right"><a href="/#/admin/hasil-hitung" style="color:white" class="ti-arrow-right"> Next</a></button>
    </div>
</template>
<script>
  import axios from 'axios'
  export default {
    data () {
      return {
        id: '',
        items: [],
        namaKandidat1: '',
        memorySelected1: '',
        priceSelected1: '',
        batterySelected1: '',
        processorSelected1: '',
        ramSelected1: '',
        screenSelected1: '',
        rearCameraSelected1: '',
        brandSelected1: '',
        namaKandidat2: '',
        memorySelected2: '',
        priceSelected2: '',
        batterySelected2: '',
        processorSelected2: '',
        ramSelected2: '',
        screenSelected2: '',
        rearCameraSelected2: '',
        brandSelected2: '',
        namaKandidat3: '',
        memorySelected3: '',
        priceSelected3: '',
        batterySelected3: '',
        processorSelected3: '',
        ramSelected3: '',
        screenSelected3: '',
        rearCameraSelected3: '',
        brandSelected3: '',
        namaKandidat4: '',
        memorySelected4: '',
        priceSelected4: '',
        batterySelected4: '',
        processorSelected4: '',
        ramSelected4: '',
        screenSelected4: '',
        rearCameraSelected4: '',
        brandSelected4: '',
        namaKandidat5: '',
        memorySelected5: '',
        priceSelected5: '',
        batterySelected5: '',
        processorSelected5: '',
        ramSelected5: '',
        screenSelected5: '',
        rearCameraSelected5: '',
        brandSelected5: '',
        namaKandidat6: '',
        memorySelected6: '',
        priceSelected6: '',
        batterySelected6: '',
        processorSelected6: '',
        ramSelected6: '',
        screenSelected6: '',
        rearCameraSelected6: '',
        brandSelected6: ''
      }
    },
    mounted: function () {
      // this.getKandidat()
    },
    methods: {
      isiKandidat: function (id) {
        this.id = id
        this.putKandidat()
      },
      putKandidat: function () {
        const URL = '/api/step2/' + this.id
        if (this.id === 1) {
          axios.put(URL, {
            'namaKandidat': this.namaKandidat1,
            'ram': this.ramSelected1,
            'processor': this.processorSelected1,
            'battery': this.batterySelected1,
            'price': this.priceSelected1,
            'intMemory': this.memorySelected1,
            'screen': this.screenSelected1,
            'brand': this.brandSelected1,
            'rearCamera': this.rearCameraSelected1
          })
          .then(res => {
            alert('Kandidat masuk')
            // this.putNilai()
          })
          .catch(err => {
            alert(err)
          })
        } else if (this.id === 2) {
          axios.put(URL, {
            'namaKandidat': this.namaKandidat2,
            'ram': this.ramSelected2,
            'processor': this.processorSelected2,
            'battery': this.batterySelected2,
            'price': this.priceSelected2,
            'intMemory': this.memorySelected2,
            'screen': this.screenSelected2,
            'brand': this.brandSelected2,
            'rearCamera': this.rearCameraSelected2
          })
          .then(res => {
            alert('Kandidat masuk')
          })
          .catch(err => {
            alert(err)
          })
        } else if (this.id === 3) {
          axios.put(URL, {
            'namaKandidat': this.namaKandidat3,
            'ram': this.ramSelected3,
            'processor': this.processorSelected3,
            'battery': this.batterySelected3,
            'price': this.priceSelected3,
            'intMemory': this.memorySelected3,
            'screen': this.screenSelected3,
            'brand': this.brandSelected3,
            'rearCamera': this.rearCameraSelected3
          })
          .then(res => {
            alert('Kandidat masuk')
          })
          .catch(err => {
            alert(err)
          })
        } else if (this.id === 4) {
          axios.put(URL, {
            'namaKandidat': this.namaKandidat4,
            'ram': this.ramSelected4,
            'processor': this.processorSelected4,
            'battery': this.batterySelected4,
            'price': this.priceSelected4,
            'intMemory': this.memorySelected4,
            'screen': this.screenSelected4,
            'brand': this.brandSelected4,
            'rearCamera': this.rearCameraSelected4
          })
          .then(res => {
            alert('Kandidat masuk')
          })
          .catch(err => {
            alert(err)
          })
        } else if (this.id === 5) {
          axios.put(URL, {
            'namaKandidat': this.namaKandidat5,
            'ram': this.ramSelected5,
            'processor': this.processorSelected5,
            'battery': this.batterySelected5,
            'price': this.priceSelected5,
            'intMemory': this.memorySelected5,
            'screen': this.screenSelected5,
            'brand': this.brandSelected5,
            'rearCamera': this.rearCameraSelected5
          })
          .then(res => {
            alert('Kandidat masuk')
          })
          .catch(err => {
            alert(err)
          })
        } else if (this.id === 6) {
          axios.put(URL, {
            'namaKandidat': this.namaKandidat6,
            'ram': this.ramSelected6,
            'processor': this.processorSelected6,
            'battery': this.batterySelected6,
            'price': this.priceSelected6,
            'intMemory': this.memorySelected6,
            'screen': this.screenSelected6,
            'brand': this.brandSelected6,
            'rearCamera': this.rearCameraSelected6
          })
          .then(res => {
            alert('Kandidat masuk')
          })
          .catch(err => {
            alert(err)
          })
        }
      }
    }
  }

</script>
<style>

</style>
