# Use a Node.js image to build the frontend
FROM node:18 AS build

WORKDIR /app

# Copy package.json and install dependencies
COPY package.json package-lock.json ./
RUN npm install

# Copy the rest of the project
COPY . .

# Build the React app
RUN npm run build

# Use an Nginx image to serve the built React app
FROM nginx:alpine
COPY --from=build /app/build /usr/share/nginx/html

# Expose port 80 to serve the frontend
EXPOSE 80

CMD ["nginx", "-g", "daemon off;"]
